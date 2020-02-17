package org.halls.servlets;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.halls.business.Complaints;
import org.halls.data.ComplaintsIO;


public class submitComplainsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstName=request.getParameter("firstName");
        String lastName=request.getParameter("lastName");
        String complaintTitle=request.getParameter("complaintTitle");
        String regNo=request.getParameter("regNo");
        String hostel=request.getParameter("hostel");
        String block=request.getParameter("block");
        String roomNo=request.getParameter("roomNo");
        String complaintDescription=request.getParameter("complaintDescription");
        
        
        Complaints complaints=new Complaints();
        complaints.setFirstName(firstName);
        complaints.setLastName(lastName);
        complaints.setComplaintTitle(complaintTitle);
        complaints.setRegNo(regNo);
        complaints.setHostel(hostel);
        complaints.setBlock(block);
        complaints.setRoomNo(roomNo);
        complaints.setComplaintDescription(complaintDescription);
        
        
        try {
            if(ComplaintsIO.insert(complaints)>0){
                String message="complaint submitted"; 
                request.setAttribute("message", message);
            }
            else
            {
                String message="Error occurred, resubmit your complaint.";
                request.setAttribute("message", message);
            }
                String url="/studentUI.jsp";
                RequestDispatcher dispatcher=getServletContext().
                getRequestDispatcher(url);
               dispatcher.forward(request,response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(submitComplainsServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

  
   

}
