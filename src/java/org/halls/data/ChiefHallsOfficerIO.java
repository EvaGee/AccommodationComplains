/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.halls.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.halls.business.ChiefHallsOfficer;
import org.halls.business.Mason;

/**
 *
 * @author Eva Gee
 */
public class ChiefHallsOfficerIO {
    public static ChiefHallsOfficer selectChiefHallsOfficer(String staffNo, String password) throws ClassNotFoundException
    {
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "hallscomplains"; 
        String dbUsername = "root"; 
        String dbPassword = "";  
        String query="SELECT * FROM chiefhallsofficer WHERE staffNo=? && password=?";
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
                ChiefHallsOfficer chiefHallsOfficer=null;
                if(rs.next())
                {
                    chiefHallsOfficer=new ChiefHallsOfficer();
                    chiefHallsOfficer.setFname(rs.getString("firstName"));
                    chiefHallsOfficer.setLname(rs.getString("lastName"));
                    chiefHallsOfficer.setUname(rs.getString("userName"));
                    chiefHallsOfficer.setPhoneNumber(rs.getString("phoneNumber"));
                    chiefHallsOfficer.setStaffNo(rs.getString("staffNo"));
                    chiefHallsOfficer.setPassword(rs.getString("password"));
                    
                    con.close();
                    return chiefHallsOfficer;
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
