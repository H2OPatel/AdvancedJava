<%@include file="UserInfoHeader.html"%>
<html>
<body>

	<h1 align="center">
		<font color="red"> User Info </font>
	</h1>


	<%
		Object obj = request.getAttribute("Errors");
		String err;
		if (obj != null) {
			err = (String) obj;
	%>
	<%=err %>
	<%
	}
	%>


	<form method="post" action="/MyFinalWebMVC/aui">

		<table>
			<tr>
				<td><label for="userid">User Id</label></td>
				<td><input type="text" name="userid" id="userid"></td>
			</tr>
			<tr>
				<td><label for="password">Password</label></td>
				<td><input type="password" name="password" id="password"></td>
			</tr>
		</table>
		<br> <br> <input type=submit name="submit" value="submit" />
	</form>

	</body>
</html>