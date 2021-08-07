
<html>
<head>
<title>Welcome</title>
</head>
<body>
	
	<jsp:useBean id="persondata" class="com.as.samples.PersonInfo" scope="session"/>
	<font  size="10" color="green">First Name</font>
	<jsp:getProperty property="firstname" name="persondata"/>
	<br/>
	<font  size="10" color="green">First Name</font>
	<jsp:getProperty property="middlename" name="persondata"/>
	<br/>
	<font  size="10" color="green">First Name</font>
	<jsp:getProperty property="lastname" name="persondata"/>
</body>
</html>