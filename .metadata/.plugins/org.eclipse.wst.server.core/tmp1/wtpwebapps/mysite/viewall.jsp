<%@include file="header.html"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>View All Contacts</title>
</head>

<body bgcolor="#ffffee" leftmargin="10px" rightmargin="10px">
	<h1 align="center">
		<table border="1">
			<tr bgcolor="orange">
				<td>Email ID</td>
				<td>First Name</td>
				<td>Middle Name</td>
				<td>Last Name</td>
				<td>Home Phone</td>
				<td>Work Phone</td>
				<td>Mobile Phone</td>
				<td>Group ID</td>
			</tr>
			<c:forEach var="items" items="${eMailList}">
				<tr>
					<td>${items.eMailID}</td>
					<td>${items.fName}</td>
					<td>${items.mName}</td>
					<td>${items.lName}</td>
					<td>${items.hPhone}</td>
					<td>${items.wPhone}</td>
					<td>${items.mPhone}</td>
					<td>${items.groupID}</td>
				</tr>

			</c:forEach>
		</table>
	</h1>
</body>



</html>
<%@include file="footer.html"%>

</body>
