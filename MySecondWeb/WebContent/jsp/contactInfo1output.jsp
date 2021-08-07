
<html>
<head>

<title>Contact Info</title>
</head>
<body>
	<font size="8px" color="yellow">Street Address</font><%= session.getAttribute("add") %>
	<br/>
	<font size="8px" color="yellow">City Name</font><%= session.getAttribute("cty") %>
	<br/>
	<font size="8px" color="yellow">State Name</font><%= session.getAttribute("ste") %>
	<br/>
	<font size="8px" color="yellow">Country Name</font><%= session.getAttribute("ctr") %>
	<br/>
	<font size="8px" color="yellow">Phone Number</font><%= session.getAttribute("phn") %>
</body>
</html>