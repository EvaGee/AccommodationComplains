 package org.halls.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.halls.business.Student;

public class StudentIO {
    
    public static int insert(Student student) throws ClassNotFoundException
    {
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "hallscomplains"; 
        String dbUsername = "root"; 
        String dbPassword = ""; 
        String sql="INSERT INTO student(firstName, lastName, userName, regno, hostel, block, room, password) "
                                    + "VALUES(?,?,?,?,?,?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection con = DriverManager.getConnection(dbURL + dbName, 
             dbUsername,dbPassword); 
            PreparedStatement st = con.prepareStatement(sql)) 
              {
                st.setString(1, student.getFirstName());
                st.setString(2, student.getLastName());
                st.setString(3, student.getUserName());
                st.setString(4, student.getRegNo());
                st.setString(5, student.getHostel());
                st.setString(6, student.getBlock());
                st.setString(7, student.getRoomNo());
                st.setString(8, student.getPassword());  
                return st.executeUpdate();
              }
        catch(Exception e)
        {
            e.printStackTrace(); 
            return 0;
        }
    }   
    
    
    public static Student selectStudent(String regNo, String password) throws ClassNotFoundException
    {
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "hallscomplains"; 
        String dbUsername = "root"; 
        String dbPassword = "";  
        String query="SELECT * FROM student WHERE regNo=? && password=?";
        ResultSet rs;
        Class.forName("com.mysql.jdbc.Driver");
       try (Connection con = DriverManager.getConnection(dbURL + dbName, 
                    dbUsername,
                    dbPassword); 
               PreparedStatement st = con.prepareStatement(query)) 
       {               
                st.setString(1, regNo);
                st.setString(2, password);
                rs = st.executeQuery();
                Student student=null;
                if(rs.next())
                {
                    student=new Student();
                    student.setFirstName(rs.getString("firstName"));
                    student.setLastName(rs.getString("lastName"));
                    student.setUserName(rs.getString("userName"));
                    student.setRegNo(rs.getString("regNo"));
                    student.setHostel(rs.getString("hostel"));
                    student.setBlock(rs.getString("block"));
                    student.setRoomNo(rs.getString("room"));
                    student.setPassword(rs.getString("password"));
                    
                    con.close();
                    return student;
                }
                else
                {
                    return null;
                }
                
       } 
        catch(Exception e)
        {
            e.printStackTrace(); 
            return null;   
        } 
       
    }
}
