package org.halls.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.halls.business.Carpenter;
import org.halls.business.Mason;

public class CarpenterIO {
    public static int insert(Carpenter carpenter) throws ClassNotFoundException
    {
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "hallscomplains"; 
        String dbUsername = "root"; 
        String dbPassword = ""; 
        String sql="INSERT INTO carpenter(firstName, lastName, userName, staffNo, phoneNumber, password) "
                                    + "VALUES(?,?,?,?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection con = DriverManager.getConnection(dbURL + dbName, 
             dbUsername,dbPassword); 
            PreparedStatement st = con.prepareStatement(sql)) 
              {
                st.setString(1, carpenter.getFname());
                st.setString(2, carpenter.getLname());
                st.setString(3, carpenter.getUname());
                st.setString(4, carpenter.getStaffNo());
                st.setString(5, carpenter.getPhoneNumber());
                st.setString(6, carpenter.getPassword()); 
                return st.executeUpdate();
              }
        catch(Exception e)
        {
            e.printStackTrace(); 
            return 0;
        }
    }   
    
    public static Carpenter selectCarpenter(String staffNo, String password) throws ClassNotFoundException
    {
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "hallscomplains"; 
        String dbUsername = "root"; 
        String dbPassword = "";  
        String query="SELECT * FROM carpenter WHERE staffNo=? && password=?";
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
                Carpenter carpenter=null;
                if(rs.next())
                {
                   carpenter=new Carpenter();
                    carpenter.setFname(rs.getString("firstName"));
                    carpenter.setLname(rs.getString("lastName"));
                    carpenter.setUname(rs.getString("userName"));
                    carpenter.setPhoneNumber(rs.getString("phoneNumber"));
                    carpenter.setStaffNo(rs.getString("staffNo"));
                    carpenter.setPassword(rs.getString("password"));
                    
                    con.close();
                    return carpenter;
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
