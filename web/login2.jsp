<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
    <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Login  Here</title>
  </head>
  <body>
      
    <div class="container-fluid bg">
		<div class="row">
                <div class="col-md-4 col-sm-4 col-xs-12"></div>
		
            <form class="form-container" method="post" action="LoginServlet" name="login_form" id="login_form" onsubmit="return validateForm()">
                <span class="login100-form-title p-b-34 p-t-27">
                    Accommodation Complaints
                </span>
                <div class="form-group">
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
                  <div class="form-group">
                    <label for="regNo">RegNo:</label>
                    <input type="text" class="form-control" name="regNo" id="regNo" placeholder="Regno/StaffNo">
                  </div>
                  <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" class="form-control" name="password" id="password" placeholder="Password">
                  </div>
                  <button type="submit" class="btn btn-success btn-block">Submit</button>
            </form>
	
		</div>
	</div>
	
	<script type="text/javascript">
	 function validateForm()                                    
     { 
         var regNo = document.forms["login_form"][" regNo"];               
         var password = document.forms["login_form"]["password"];
        
         if ( regNo.value == "")                                  
         { 
             window.alert("Please enter your RegNo."); 
              regNo.focus(); 
             return false; 
         } 

         if (password.value == "")                                  
         { 
             window.alert("Please enter your Password."); 
             password.focus(); 
             return false; 
         }

         return true; 
     }	
	</script>
	
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>