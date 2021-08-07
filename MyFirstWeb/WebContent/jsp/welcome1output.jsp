
<html>
<head>
<title>Welcome</title>
</head>
<body>
	
	<font size="10px" color="green">First Name</font><%= session.getAttribute("ofname") %>
	<br/>
	<font size="10px" color="green">Last Name</font><%= session.getAttribute("olname") %>
	<br/>
	<font size="10px" color="green">Middle Name</font><%= session.getAttribute("omname") %>
</body>
</html>