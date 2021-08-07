<html>
<body>
	<h1 align="center">
			<font  color="red"> Welcome Page </font>
		</h1>
	
	<%
		Object obj = request.getAttribute("errors");
		String err;
		if (obj !=null){
			err = (String) obj;
		
	%>
	<%= err %>
	<%
	}
	%>

	<form method="get" action="/MyFinalWebValidation/ws">

		<table>
			<tr>
				<td><label for="fname">First Name</label></td>
				<td><input type="text" name="fname" id="fname"></td>
			</tr>
			<tr>
				<td><label for="lname">Last Name</label></td>
				<td><input type="text" name="lname" id="lname"></td>
			</tr>
			<tr>
				<td><label for="mname">Middle Name</label></td>
				<td><input type="text" name="mname" id="mname"></td>
			</tr>
		</table>
		<br> <br> <input type=submit name="submit" value="submit" />
		</form>

		</body>
</html>