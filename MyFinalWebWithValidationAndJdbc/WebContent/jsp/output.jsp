<html>
<head>
<title>Welcome</title>
</head>
<body>
	<jsp:useBean id="userdata" class="beans.UserInfo" scope="session"/>
	<font size="10" color="orange">User Id</font>
	<jsp:getProperty property="uid" name="userdata"/>
	<br/>
	<font size="10" color="orange">Password</font>
	<jsp:getProperty property="pwd" name="userdata"/>
	<br/>

	<jsp:useBean id="persondata" class="beans.PersonInfo" scope="session"/>
	<font  size="10" color="green">First Name</font>
	<jsp:getProperty property="firstname" name="persondata"/>
	<br/>
	<font  size="10" color="green">Middle Name</font>
	<jsp:getProperty property="middlename" name="persondata"/>
	<br/>
	<font  size="10" color="green">Last Name</font>
	<jsp:getProperty property="lastname" name="persondata"/>
	<br/>
	
	
	<jsp:useBean id="contactinfo" class="beans.ContactInfo" scope="session"/>
	<font size="8px" color="yellow">Address</font>
	<jsp:getProperty property="address" name="contactinfo"/>
	<br/>
	<font size="8px" color="yellow">City Name</font>
	<jsp:getProperty property="city" name="contactinfo"/>
	<br/>
	<font size="8px" color="yellow">State Name</font>
	<jsp:getProperty property="state" name="contactinfo"/>
	<br/>
	<font size="8px" color="yellow">Country Name</font>
	<jsp:getProperty property="country" name="contactinfo"/>
	<br/>
	<font size="8px" color="yellow">Phone Number</font>
	<jsp:getProperty property="phone" name="contactinfo"/>
	<br/>
	
	
	<jsp:useBean id="bankinfo" class="beans.BankInfo" scope="session"/>
	<font size="7px" color="blue">Bank Name</font>
	<jsp:getProperty property="bankname" name="bankinfo"/>
	<br/>
	<font size="7px" color="blue">Account Number</font>
	<jsp:getProperty property="accountnumber" name="bankinfo"/>
	<br/>
	<font size="7px" color="blue">SSN Number</font>
	<jsp:getProperty property="ssn" name="bankinfo"/>
</body>
</html>