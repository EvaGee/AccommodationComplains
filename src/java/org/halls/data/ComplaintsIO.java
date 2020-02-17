package org.halls.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.halls.business.Complaints;
import org.halls.business.HallsOfficer;

public class ComplaintsIO {
     public static int insert(Complaints complaints) throws ClassNotFoundException
    {
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "hallscomplains"; 
        String dbUsername = "root"; 
        String dbPassword = ""; 
        String sql="INSERT INTO complains(firstName, lastName, complaintTitle,"
                + "regno, hostel, block, room, "
                + "complaintDescription) "
                                    + "VALUES(?,?,?,?,?,?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection con = DriverManager.getConnection(dbURL + dbName, 
             dbUsername,dbPassword); 
            PreparedStatement st = con.prepareStatement(sql)) 
              {
                st.setString(1, complaints.getFirstName());
                st.setString(2, complaints.getLastName());
                st.setString(3, complaints.getComplaintTitle());
                st.setString(4, complaints.getRegNo());
                st.setString(5, complaints.getHostel());
                st.setString(6, complaints.getBlock());
                st.setString(7, complaints.getRoomNo());
                st.setString(8, complaints.getComplaintDescription());
                
                return st.executeUpdate();
              }
        catch(Exception e)
        {
            e.printStackTrace(); 
            return 0;
        }
    }  
     
     public static ArrayList<Complaints> selectComplaints() throws ClassNotFoundException
    {
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "hallscomplains"; 
        String dbUsername = "root"; 
        String dbPassword = "";  
        String query="SELECT * FROM complains";
        ResultSet rs;
        ArrayList<Complaints> list=new ArrayList<>();
        Class.forName("com.mysql.jdbc.Driver");
       try (Connection con = DriverManager.getConnection(dbURL + dbName, 
                    dbUsername,
                    dbPassword); 
               PreparedStatement st = con.prepareStatement(query)) 
       {       
                rs = st.executeQuery();
                Complaints complaints=null;
                if(rs.next())
                {
                    complaints=new Complaints();
                    complaints.setFirstName(rs.getString("firstName"));
                    complaints.setLastName(rs.getString("lastName"));
                    complaints.setRegNo(rs.getString("regno"));
                    complaints.setComplaintTitle(rs.getString("complaintTitle"));
                    complaints.setComplaintDescription(rs.getString("complaintDescription"));
                    complaints.setHostel(rs.getString("hostel"));
                    complaints.setBlock(rs.getString("block"));
                    complaints.setRoomNo(rs.getString("room"));
                    
                    list.add(complaints);
                    
                    con.close();
                    return list;
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
