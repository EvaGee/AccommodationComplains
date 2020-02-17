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
import org.halls.business.Student;
import org.halls.data.StudentIO;

public class AddStudentServlet extends HttpServlet 
{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstName=request.getParameter("firstName");
        String lastName=request.getParameter("lastName");
        String userName=request.getParameter("userName");
        String regNo=request.getParameter("regNo");
        String hostel=request.getParameter("hostel");
        String block=request.getParameter("block");
        String roomNo=request.getParameter("roomNo");
        String password=request.getParameter("password");
        
        Student student=new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setUserName(userName);
        student.setRegNo(regNo);
        student.setHostel(hostel);
        student.setBlock(block);
        student.setRoomNo(roomNo);
        student.setPassword(password);

        try {
            if(StudentIO.insert(student)>0)
            {
                String message1="Student successfully registered";
                String url1="/chiefHallsOfficerUI.jsp.jsp";
                request.setAttribute("message", message1);

                RequestDispatcher dispatcher=getServletContext().
                getRequestDispatcher(url1);
                dispatcher.forward(request,response);
            }
              else{
                String message="This student registration number is already registered";
                String url="/studentRegistration.jsp";
                request.setAttribute("message", message);

                RequestDispatcher dispatcher=getServletContext().
                       getRequestDispatcher(url);
               dispatcher.forward(request,response);  
            }
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(AddStudentServlet.class.getName()).log(Level.SEVERE, null, ex);
        }           
    } 
}
        
    
        
         
    

