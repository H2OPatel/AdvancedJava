
<html>
<head>

<title>Contact Info</title>
</head>
<body>
	<jsp:useBean id="ContactInfo" class="servlets.ContactInfo" scope="session"/>
	<font size="8px" color="yellow">Address</font>
	<jsp:getProperty property="address" name="ContactInfo"/>
	<br/>
	<font size="8px" color="yellow">City Name</font>
	<jsp:getProperty property="city" name="ContactInfo"/>
	<br/>
	<font size="8px" color="yellow">State Name</font>
	<jsp:getProperty property="state" name="ContactInfo"/>
	<br/>
	<font size="8px" color="yellow">Country Name</font><%= session.getAttribute("ctr") %>
	<jsp:getProperty property="country" name="ContactInfo"/>
	<br/>
	<font size="8px" color="yellow">Phone Number</font>
	<jsp:getProperty property="phone" name="ContactInfo"/>
</body>
</html>