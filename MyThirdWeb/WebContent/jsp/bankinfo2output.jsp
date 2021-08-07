
<html>
<head>

<title>Bank Info</title>
</head>
<body>
	<jsp:useBean id="bankInfo" class="servlets.BankInfo" scope="session"/>
	<font size="7px" color="blue">Bank Name</font>
	<jsp:getProperty property="bankname" name="bankInfo"/>
	<br/>
	<font size="7px" color="blue">Account Number</font>
	<jsp:getProperty property="accountnumber" name="bankInfo"/>
	<br/>
	<font size="7px" color="blue">SSN Number</font>
	<jsp:getProperty property="ssn" name="bankInfo"/>

</body>
</html>