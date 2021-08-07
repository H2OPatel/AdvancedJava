<%@include file="header.html"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<title>View By Group</title>
<%@include file="displayformerrors.jsp"%>
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
			</tr>

			<!-- 			for(String word : words){ -->
			<!-- 				sysout(word); -->
			<!-- 			} -->
			<%-- 			<c:forEach var="word" items="${words}"> --%>

			<c:forEach var="email" items="${eMailList}">
				<tr>
					<td>${email.eMailID}</td>
					<td>${email.fName}</td>
					<td>${email.mName}</td>
					<td>${email.lName}</td>
					<td>${email.hPhone}</td>
					<td>${email.wPhone}</td>
					<td>${email.mPhone}</td>

				</tr>
			</c:forEach>
		</table>
	</h1>
</body>



</html>
<%@include file="footer.html"%>

</body>
