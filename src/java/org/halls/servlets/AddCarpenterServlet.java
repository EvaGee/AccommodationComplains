package org.halls.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.halls.business.Carpenter;
import org.halls.business.Mason;
import org.halls.data.CarpenterIO;
import org.halls.data.MasonIO;

public class AddCarpenterServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String uname=request.getParameter("uname");
        String staffNo=request.getParameter("staffNo");
        String phoneNumber=request.getParameter("phoneNumber");
        String password=request.getParameter("password");
        
        Carpenter carpenter=new Carpenter();
        carpenter.setFname(fname);
        carpenter.setLname(lname);
        carpenter.setUname(uname);
        carpenter.setStaffNo(staffNo);
        carpenter.setPhoneNumber(phoneNumber);
        carpenter.setPassword(password);

        try {
            if(CarpenterIO.insert(carpenter)>0)
            {
                String message1="Carpenter successfully registered";
                String url1="/chiefHallsOfficerUI.jsp.jsp";
                request.setAttribute("message", message1);

                RequestDispatcher dispatcher=getServletContext().
                getRequestDispatcher(url1);
               dispatcher.forward(request,response);
            }
            else{
                String message="This carpenter staff number is already registered";
                String url="/carpenterRegistration.jsp";
                request.setAttribute("message", message);

                RequestDispatcher dispatcher=getServletContext().
                       getRequestDispatcher(url);
               dispatcher.forward(request,response);  
            }
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(AddCarpenterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    }

}
