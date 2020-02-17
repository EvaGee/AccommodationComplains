
package org.halls.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.halls.business.HallsOfficer;

public class HallsOfficerIO {
    public static int insert(HallsOfficer hallsOfficer) throws ClassNotFoundException
    {
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "hallscomplains"; 
        String dbUsername = "root"; 
        String dbPassword = ""; 
        String sql="INSERT INTO hallsofficer(firstName, lastName, userName, staffNo, phoneNumber, password) "
                                    + "VALUES(?,?,?,?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection con = DriverManager.getConnection(dbURL + dbName, 
             dbUsername,dbPassword); 
            PreparedStatement st = con.prepareStatement(sql)) 
              {
                st.setString(1, hallsOfficer.getFname());
                st.setString(2, hallsOfficer.getLname());
                st.setString(3, hallsOfficer.getUname());
                st.setString(4, hallsOfficer.getStaffNo());
                st.setString(5, hallsOfficer.getPhoneNumber());
                st.setString(6, hallsOfficer.getPassword()); 
                return st.executeUpdate();
              }
        catch(Exception e)
        {
            e.printStackTrace(); 
            return 0;
        }
    } 
    public static HallsOfficer selectHallsOfficer(String staffNo, String password) throws ClassNotFoundException
    {
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "hallscomplains"; 
        String dbUsername = "root"; 
        String dbPassword = "";  
        String query="SELECT * FROM hallsofficer WHERE staffNo=? && password=?";
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
                HallsOfficer hallsOfficer=null;
                if(rs.next())
                {
                    hallsOfficer=new HallsOfficer();
                    hallsOfficer.setFname(rs.getString("firstName"));
                    hallsOfficer.setLname(rs.getString("lastName"));
                    hallsOfficer.setUname(rs.getString("userName"));
                    hallsOfficer.setPhoneNumber(rs.getString("phoneNumber"));
                    hallsOfficer.setStaffNo(rs.getString("staffNo"));
                    hallsOfficer.setPassword(rs.getString("password"));
                    
                    con.close();
                    return hallsOfficer;
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
