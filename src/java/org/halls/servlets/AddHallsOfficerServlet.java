/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import org.halls.business.HallsOfficer;
import org.halls.data.CarpenterIO;
import org.halls.data.HallsOfficerIO;

/**
 *
 * @author Eva Gee
 */
public class AddHallsOfficerServlet extends HttpServlet {
 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String uname=request.getParameter("uname");
        String staffNo=request.getParameter("staffNo");
        String phoneNumber=request.getParameter("phoneNumber");
        String password=request.getParameter("password");
        
        HallsOfficer hallsOfficer=new HallsOfficer();
        hallsOfficer.setFname(fname);
        hallsOfficer.setLname(lname);
        hallsOfficer.setUname(uname);
        hallsOfficer.setStaffNo(staffNo);
        hallsOfficer.setPhoneNumber(phoneNumber);
        hallsOfficer.setPassword(password);

        try {
            if(HallsOfficerIO.insert(hallsOfficer)>0)
            {
                String message1="HallsOfficer successfully registered";
                String url1="/chiefHallsOfficerUI.jsp";
                request.setAttribute("message", message1);

                RequestDispatcher dispatcher=getServletContext().
                getRequestDispatcher(url1);
               dispatcher.forward(request,response);
            }
            else{
                String message="This hallsOfficer staff number is already registered";
                String url="/hallsOfficerRegistration.jsp";
                request.setAttribute("message", message);

                RequestDispatcher dispatcher=getServletContext().
                       getRequestDispatcher(url);
               dispatcher.forward(request,response);  
            }
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(AddHallsOfficerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    }
}
