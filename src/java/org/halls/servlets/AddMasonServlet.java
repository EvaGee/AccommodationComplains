package org.halls.servlets;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.halls.business.Mason;
import org.halls.data.MasonIO;

public class AddMasonServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String uname=request.getParameter("uname");
        String staffNo=request.getParameter("staffNo");
        String phoneNumber=request.getParameter("phoneNumber");
        String password=request.getParameter("password");
        
        Mason mason=new Mason();
        mason.setFname(fname);
        mason.setLname(lname);
        mason.setUname(uname);
        mason.setStaffNo(staffNo);
        mason.setPhoneNumber(phoneNumber);
        mason.setPassword(password);

        try {
            if(MasonIO.insert(mason)>0)
            {
                String message1="Mason successfully registered";
                String url1="/chiefHallsOfficerUI.jsp.jsp";
                request.setAttribute("message", message1);

                RequestDispatcher dispatcher=getServletContext().
                getRequestDispatcher(url1);
               dispatcher.forward(request,response);
            }
            else{
                String message="This mason staff number is already registered";
                String url="/masonRegistration.jsp";
                request.setAttribute("message", message);

                RequestDispatcher dispatcher=getServletContext().
                       getRequestDispatcher(url);
               dispatcher.forward(request,response);  
            }
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(AddMasonServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
