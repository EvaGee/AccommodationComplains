package org.halls.servlets;

import java.io.IOException;
import java.util.ArrayList;
 import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.halls.business.Carpenter;
import org.halls.business.ChiefHallsOfficer;
import org.halls.business.Complaints;
import org.halls.business.HallsOfficer;
import org.halls.business.Mason;
import org.halls.business.Student;
import org.halls.data.CarpenterIO;
import org.halls.data.ChiefHallsOfficerIO;
import org.halls.data.ComplaintsIO;
import org.halls.data.HallsOfficerIO;
import org.halls.data.MasonIO;
import org.halls.data.StudentIO;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String category=request.getParameter("category");
        String staffNo=request.getParameter("regNo");
        String regNo=request.getParameter("regNo");
        String password=request.getParameter("password");
        
        switch(category)
        {
            case "Student":
               
                Student student=new Student();
                student.setRegNo(regNo);
                student.setPassword(password);
     
            try {
                Student student1=StudentIO.selectStudent(regNo, password);
                if(StudentIO.selectStudent(regNo, password)!=null){
                HttpSession session=request.getSession();
                session.setAttribute("student", student1);
               
                String url="/studentUI.jsp";
                
                RequestDispatcher dispatcher=getServletContext().
                       getRequestDispatcher(url);
                dispatcher.forward(request,response);
                }
                else
                {
                String message="invalid login";
                String url="/login.jsp";
                request.setAttribute("message", message);
                RequestDispatcher dispatcher=getServletContext().
                       getRequestDispatcher(url);
                dispatcher.forward(request,response);
                }
               } 
            catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            case "Mason":
                
                Mason mason=new Mason();
                mason.setStaffNo(staffNo);
                mason.setPassword(password);
     
            try {
                Mason mason1=MasonIO.selectMason(staffNo, password);
                if(MasonIO.selectMason(staffNo, password)!=null){
                HttpSession session=request.getSession();
                session.setAttribute("mason", mason1);
               
                String url="/masonUI.jsp";
                
                RequestDispatcher dispatcher=getServletContext().
                       getRequestDispatcher(url);
                dispatcher.forward(request,response);
                }
                else
                {
                String message="invalid login";
                String url="/login.jsp";
                request.setAttribute("message", message);
                RequestDispatcher dispatcher=getServletContext().
                       getRequestDispatcher(url);
                dispatcher.forward(request,response);
                }
               } 
            catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            case "Chief Halls Officer":
                
                ChiefHallsOfficer chiefHallsOfficer=new ChiefHallsOfficer();
                chiefHallsOfficer.setStaffNo(staffNo);
                chiefHallsOfficer.setPassword(password);
     
            try {
                ChiefHallsOfficer chiefHallsOfficer1=ChiefHallsOfficerIO.selectChiefHallsOfficer(staffNo, password);
                if(ChiefHallsOfficerIO.selectChiefHallsOfficer(staffNo, password)!=null){
                HttpSession session=request.getSession();
                session.setAttribute("chiefHallsOfficer", chiefHallsOfficer1);
               
                String url="/chiefHallsOfficerUI.jsp";
                
                RequestDispatcher dispatcher=getServletContext().
                       getRequestDispatcher(url);
                dispatcher.forward(request,response);
                }
                else
                {
                String message="invalid login";
                String url="/login.jsp";
                request.setAttribute("message", message);
                RequestDispatcher dispatcher=getServletContext().
                       getRequestDispatcher(url);
                dispatcher.forward(request,response);
                }
               } 
            catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            case "Halls Officer":
                
                HallsOfficer hallsOfficer=new HallsOfficer();
                hallsOfficer.setStaffNo(staffNo);
                hallsOfficer.setPassword(password);
     
            try {
                HallsOfficer hallsOfficer1=HallsOfficerIO.selectHallsOfficer(staffNo, password);
                if(HallsOfficerIO.selectHallsOfficer(staffNo, password)!=null){
                
                ArrayList<Complaints> list=ComplaintsIO.selectComplaints();
                HttpSession session=request.getSession();
                session.setAttribute("hallsOfficer", hallsOfficer1);
                request.setAttribute("list", list);
                String url="/hallsOfficerUI.jsp";
                
                RequestDispatcher dispatcher=getServletContext().
                       getRequestDispatcher(url);
                dispatcher.forward(request,response);
                
                }
                else
                {
                String message="invalid login";
                String url="/login.jsp";
                request.setAttribute("message", message);
                RequestDispatcher dispatcher=getServletContext().
                       getRequestDispatcher(url);
                dispatcher.forward(request,response);
                }
               } 
            catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            case "Carpenter":
                
                Carpenter carpenter=new Carpenter();
                carpenter.setStaffNo(staffNo);
                carpenter.setPassword(password);
     
            try {
                Carpenter carpenter1=CarpenterIO.selectCarpenter(staffNo, password);
                if(CarpenterIO.selectCarpenter(staffNo, password)!=null){
                HttpSession session=request.getSession();
                session.setAttribute("carpenter", carpenter1);
               
                String url="/carpenterUI.jsp";
                
                RequestDispatcher dispatcher=getServletContext().
                       getRequestDispatcher(url);
                dispatcher.forward(request,response);
                }
                else
                {
                String message="invalid login";
                String url="/login.jsp";
                request.setAttribute("message", message);
                RequestDispatcher dispatcher=getServletContext().
                       getRequestDispatcher(url);
                dispatcher.forward(request,response);
                }
               } 
            catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }
    
}
 