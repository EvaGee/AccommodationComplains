<%-- 
    Document   : login4
    Created on : Dec 2, 2019, 9:27:30 PM
    Author     : Eva Gee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <div class="limiter">
	<div class="container-login100">
	<div class="wrap-login100">
            
            <form class="login100-form validate-form" method="post" action="LoginServlet" name="login_form" id="login_form" onsubmit="return validateForm()">
                
                <span class="login100-form-title p-b-34 p-t-27">
			Accommodation Complaints
                </span>
                <div class="wrap-input100 validate-input">
                    <p>${message}</p>
                    <label for="category">Category:</label>
                    <select class="form-control" id="category" name="category">
                        <option>Admin</option>
                        <option>Student</option>
                        <option>Halls Officer</option>
                        <option>Custodian</option>
                        <option>Mason</option>
                        <option>Carpenter</option>
                        <option>Security</option>
                        <option>Plumber</option>
                        <option>Electrician</option>
                    </select>
                </div>
                  <div class="wrap-input100 validate-input">
                    <label for="regNo">RegNo/Staff No:</label>
                    <input type="text" class="input100" name="regNo" id="regNo" placeholder="RegNo/StaffNo">
                  </div>
                  <div class="wrap-input100 validate-input">
                    <label for="password">Password:</label>
                    <input type="password" class="input100" name="password" id="password" placeholder="Password">
                  </div>
                  <button type="submit" class="login100-form-btn">Login</button>
            </form>
				<!-- Form End-->
		</div>
	</div>
    </body>
</html>
