<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>
			<font color="grenn">Welcome Page</font>
		</h1>
	</center>
	<%
	Object obj = request.getAttribute("errors");
	String str;
	if (obj != null) {
		str = (String) obj;
	%>
	<font color="red"><%=str%></font>
	<%
	}
	%>
	<form method="get" action="/MyFinalWeb/ws2">

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