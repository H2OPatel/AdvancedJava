<html>
<body>

		<h1 align="center">
			<font  color="red"> Contact Info </font>
		</h1>
	<%
		Object obj = request.getAttribute("errors");
		String err;
		if (obj != null) {
			err =(String) obj;
	%>
	<%=err %>
	<%
	}
	%>

<div style="width:400px;border: 1px solid blue;padding:10px;margin:40px 0px 0px 40px;font-size:16px">
	<form method="get" action="/MyFinalWebValidation/ci">
		
		<label>Address</label>
		<input name="Address" type="text" style="height:25px;line-height:20px;margin-bottom:20px"/>
		<br>
		<label>City</label>
		<input name="City" type="text" style="height:25px;line-height:20px;margin-bottom:20px"/> 
		<br>
		<label>State</label>
		<input name="State" type="text" style="height:25px;line-height:20px;margin-bottom:20px"/>
		<br>
		<label>Country</label>
		<input name="Country" type="text" style="height:25px;line-height:20px;margin-bottom:20px"/>
		<br>
		<label>Phone</label>
		<input name="Phone" type="number" style="height:25px;line-height:20px;margin-bottom:20px"/>
		<br>
		
		<input type="submit" value="Submit"> 
		</form>


</div>
</body>
</html>