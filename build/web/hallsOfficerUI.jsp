
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="org.halls.business.Complaints"%>

<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<title>Halls Officer UI</title>
<link rel="icon" type="image/png" href="images/logo.jpg"/>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link href="css/" type="text/css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
 <button type="button" class="btn btn-danger btn-block" onClick="window.location.href='login.jsp'">Log Out</button>
 <br>
 
<div class="container-fluid bg">
<div class="row">
			<div class="col-md-2 col-sm-4 col-xs-12"></div>
            <div class="col-md-2 col-sm-4 col-xs-12"></div>
                        
            <%@page import="java.sql.DriverManager"%>
			<%@page import="java.sql.ResultSet"%>
			<%@page import="java.sql.Statement"%>
			<%@page import="java.sql.Connection"%>
			
			
			
			<h2 align="center"><font><strong>Welcome ${hallsOfficer.fname} </strong></font></h2>
                           <table id="complaints" align="center" cellpadding="5" cellspacing="5" border="1">
			<tr>
			
			</tr>
                        <tr>
			<td><b>First Name</b></td>
			<td><b>Last Name</b></td>
			<td><b>Registration Number</b></td>
			<td><b>Hostel</b></td>
			<td><b>Block</b></td>
			<td><b>Room Number</b></td>
			<td><b>Complaint Title</b></td>
			<td><b>Complaint Description</b></td>
			<td><b>Accept</b></td>
			<td><b>Reject</b></td>
			</tr>
                        <tr>
             <% 
            ArrayList<Complaints> complaintss=(ArrayList<Complaints>) request.getAttribute("list");
            for(Complaints complaints: complaintss){   %>
			
			<td><%=complaints.getFirstName()%></td>
			<td><%=complaints.getLastName()%></td>
                        <td><%=complaints.getRegNo()%></td>  
		    <td><%=complaints.getHostel()%></td>
		    <td><%=complaints.getBlock()%></td>
		    <td><%=complaints.getRoomNo()%></td>
		    <td><%=complaints.getComplaintTitle()%></td>
                    <td><%=complaints.getComplaintDescription()%></td>
		    <td>Accept</td>
		    <td>Reject</td>
			
                    <% };
                    %>	                     
            <div class="lead" onmessage="${message}"></div>

		</div>
        <div class="col-md-4 col-sm-4 col-xs-12"></div>
	</div>
</body>
</html>