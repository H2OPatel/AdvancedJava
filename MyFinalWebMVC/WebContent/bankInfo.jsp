<html>
<body>

		<h1 align="center">
			<font  color="red"> Bank Info </font>
		</h1>
	<%
		Object obj = request.getAttribute("errors");
		String err = "";
		if (obj != null) {
			err = (String) obj;
	%>
	<%=err %>
	<%
	}
	%>
	
	<div style="width:400px;border: 1px solid blue;padding:10px;margin:40px 0px 0px 40px;font-size:16px">
	<form method="get" action="/MyFinalWebWithValidationAndJdbc/bis">
	
		<label>Bank Name</label>
		<input name="BankName" type="text" style="height:25px;line-height:20px;margin-bottom:20px"/>
		<br>
		<label>Account Number</label>
		<input name="AccountNumber" type="number" style="height:25px;line-height:20px;margin-bottom:20px"/> 
		<br>
		<label>SSN</label>
		<input name="Ssn" type="number" style="height:25px;line-height:20px;margin-bottom:20px"/>
		<br>
		
		<input type="submit" value="Submit"> 
		</form>

</div>
</body>
</html>		
		