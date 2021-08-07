

<html>
<head>
<title>Welcome</title>
</head>
<body>
	<jsp:useBean id="persondata" class="beans.PersonInfo" scope="session"/>
	<font  size="10" color="green">First Name</font>
	<jsp:getProperty property="firstname" name="persondata"/>
	<br/>
	<font  size="10" color="green">First Name</font>
	<jsp:getProperty property="middlename" name="persondata"/>
	<br/>
	<font  size="10" color="green">First Name</font>
	<jsp:getProperty property="lastname" name="persondata"/>
	<br/>
	
	
	<jsp:useBean id="ContactInfo" class="beans.ContactInfo" scope="session"/>
	<font size="8px" color="yellow">Address</font>
	<jsp:getProperty property="address" name="ContactInfo"/>
	<br/>
	<font size="8px" color="yellow">City Name</font>
	<jsp:getProperty property="city" name="ContactInfo"/>
	<br/>
	<font size="8px" color="yellow">State Name</font>
	<jsp:getProperty property="state" name="ContactInfo"/>
	<br/>
	<font size="8px" color="yellow">Country Name</font>
	<jsp:getProperty property="country" name="ContactInfo"/>
	<br/>
	<font size="8px" color="yellow">Phone Number</font>
	<jsp:getProperty property="phone" name="ContactInfo"/>
	<br/>
	
	
	<jsp:useBean id="bankInfo" class="beans.BankInfo" scope="session"/>
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