package org.halls.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.halls.business.Mason;



public class MasonIO {
    public static int insert(Mason mason) throws ClassNotFoundException
    {
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "hallscomplains"; 
        String dbUsername = "root"; 
        String dbPassword = ""; 
        String sql="INSERT INTO mason(firstName, lastName, userName, staffNo, phoneNumber, password) "
                                    + "VALUES(?,?,?,?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection con = DriverManager.getConnection(dbURL + dbName, 
             dbUsername,dbPassword); 
            PreparedStatement st = con.prepareStatement(sql)) 
              {
                st.setString(1, mason.getFname());
                st.setString(2, mason.getLname());
                st.setString(3, mason.getUname());
                st.setString(4, mason.getStaffNo());
                st.setString(5, mason.getPhoneNumber());
                st.setString(6, mason.getPassword()); 
                return st.executeUpdate();
              }
        catch(Exception e)
        {
            e.printStackTrace(); 
            return 0;
        }
    } 
    public static Mason selectMason(String staffNo, String password) throws ClassNotFoundException
    {
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "hallscomplains"; 
        String dbUsername = "root"; 
        String dbPassword = "";  
        String query="SELECT * FROM mason WHERE staffNo=? && password=?";
        ResultSet rs;
        Class.forName("com.mysql.jdbc.Driver");
       try (Connection con = DriverManager.getConnection(dbURL + dbName, 
                    dbUsername,
                    dbPassword); 
               PreparedStatement st = con.prepareStatement(query)) 
       {               
                st.setString(1, staffNo);
                st.setString(2, password);
                rs = st.executeQuery();
                Mason mason=null;
                if(rs.next())
                {
                    mason=new Mason();
                    mason.setFname(rs.getString("firstName"));
                    mason.setLname(rs.getString("lastName"));
                    mason.setUname(rs.getString("userName"));
                    mason.setPhoneNumber(rs.getString("phoneNumber"));
                    mason.setStaffNo(rs.getString("staffNo"));
                    mason.setPassword(rs.getString("password"));
                    
                    con.close();
                    return mason;
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
