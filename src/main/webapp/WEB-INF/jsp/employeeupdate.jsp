<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>Spring Tiles Employee Form</title>
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
  <script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepicker" ).datepicker();
  } );
  </script>
</head>
<body>
<h2>Employee Manager</h2>
<form:form method="post" action="updateEmployee.html">

	<table>
	<tr>
		<td><form:label path="firstname" >First Name</form:label></td>
		<td><form:input path="firstname" value="${user.firstname}" required="required" /></td> 
	</tr>
	<tr>
		<td><form:label path="lastname">Last Name</form:label></td>
		<td><form:input path="lastname" required="required" /></td>
	</tr>
	<tr>
		<td><form:label path="dateofbirth">Date of Birth</form:label></td>
		<td><form:input id="datepicker" path="dateofbirth" required="required" /></td>
	</tr>
	<tr>
		<td><form:label path="salary">Salary</form:label></td>
		<td><form:input path="salary" type="number" required="required" /></td>
	</tr>
	
	<tr>
		<td><form:label path="department">Department</form:label></td>
		<td><form:select path="department" required="required" >
		<form:option value=""> --SELECT--</form:option>
		<form:option value="Sales"> --Sales--</form:option>
		<form:option value="Development"> --Development--</form:option>
		</form:select>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="Update Employee"/>
		</td>
	</tr>
</table>	
	
</form:form>
</body>
</html>
