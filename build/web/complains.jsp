
        <table id="complaints" align="center" cellpadding="5" cellspacing="5" border="1">
			<tr>
			
			</tr>
			<tr>
			<td><b>Complaint Id</b></td>
			<td><b>First Name</b></td>
			<td><b>Last Name</b></td>
			<td><b>Registration Number</b></td>
			<td><b>Phone Number</b></td>
			<td><b>Hostel</b></td>
			<td><b>Block</b></td>
			<td><b>Room Number</b></td>
			<td><b>Complaint Title</b></td>
			<td><b>Complaint Description</b></td>
			<td><b>Accept</b></td>
			<td><b>Reject</b></td>
			</tr>
			<%
			try{ 
			connection = DriverManager.getConnection(connectionUrl, userId, password);
			statement=connection.createStatement();
			String sql ="SELECT * FROM complaints";
			
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()){
			%>
			<tr>
			
			<td><%out.println(resultSet.getString("cid")); %></td>
			<td><%out.println(resultSet.getString("fname")); %></td>
		    <td><%out.println(resultSet.getString("lname")); %></td>
		    <td><%out.println(resultSet.getString("reg_no")); %></td>
		    <td><%out.println(resultSet.getString("phone_number")); %></td>
		    <td><%out.println(resultSet.getString("hostel")); %></td>
		    <td><%out.println(resultSet.getString("block")); %></td>
		    <td><%out.println(resultSet.getString("room_number")); %></td>
		    <td><%out.println(resultSet.getString("complaint_title")); %></td>
		    <td><%out.println(resultSet.getString("complaint_description")); %></td>
		    <td>
		    <form id="accept_complaint_form" name="accept_complaint_form" method="post" enctype="form-data" action="/acceptComplaint">
	   
		    <button type="submit" class="btn btn-success">Accept</button>
		    
		    <input type="hidden" id="cid" name="cid" value="<%=resultSet.getString("cid")%>">
		    <input type="hidden" id="fname" name="fname" value="<%=resultSet.getString("fname")%>">
            <input type="hidden" id="lname" name="lname" value="<%=resultSet.getString("lname")%>">
            <input type="hidden" id="regNo" name="regNo" value="<%=resultSet.getString("reg_no")%>">
            <input type="hidden" id="phoneNumber" name="phoneNumber" value="<%=resultSet.getString("phone_number")%>">
            <input type="hidden" id="hostel" name="hostel" value="<%=resultSet.getString("hostel")%>">
            <input type="hidden" id="block" name="block" value="<%=resultSet.getString("block")%>">
            <input type="hidden" id="roomNumber" name="roomNumber" value="<%=resultSet.getString("room_number")%>">
            <input type="hidden" id="complaintTitle" name="complaintTitle" value="<%=resultSet.getString("complaint_title")%>">
            <input type="hidden" id="complaintDescription" name="complaintDescription" value="<%=resultSet.getString("complaint_description")%>">
            
		    </form>
		    
		    </td>
		    <td>
		    <form name="reject_complaint_form"  method="post" enctype="form-data" action="/rejectComplaint">
		    
		   <input type="hidden" id="cid" name="cid" value="<%=resultSet.getString("cid")%>">
		    <input type="hidden" id="fname" name="fname" value="<%=resultSet.getString("fname")%>">
            <input type="hidden" id="lname" name="lname" value="<%=resultSet.getString("lname")%>">
            <input type="hidden" id="regNo" name="regNo" value="<%=resultSet.getString("reg_no")%>">
            <input type="hidden" id="phoneNumber" name="phoneNumber" value="<%=resultSet.getString("phone_number")%>">
            <input type="hidden" id="hostel" name="hostel" value="<%=resultSet.getString("hostel")%>">
            <input type="hidden" id="block" name="block" value="<%=resultSet.getString("block")%>">
            <input type="hidden" id="roomNumber" name="roomNumber" value="<%=resultSet.getString("room_number")%>">
            <input type="hidden" id="complaintTitle" name="complaintTitle" value="<%=resultSet.getString("complaint_title")%>">
            <input type="hidden" id="complaintDescription" name="complaintDescription" value="<%=resultSet.getString("complaint_description")%>">
            
		    <button type="submit" class="btn btn-danger">Reject</button>
		    
		    </form>
		    </td>
			
			</tr>
			
			<% 
			}
			
			} catch (Exception e) {
			e.printStackTrace();
			}
			%>
			</table>

