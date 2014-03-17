<html>
	<head><title> Freemarker Hello World</title></head>
	<body>
	<fieldset>
		<legend>Add User</legend>
		<form name="user" action="add.html" method="post">
			Firstname: <input type="text" name="firstname" /><br/>
    		Lastname: <input type="text" name="lastname" /><br/>
    		<input type="submit" value="Save" />
		</form>
	</fieldset>	<br/>
		<table>
			<tr>
				<th>Fisrtname</th>
				<th>Lastname</th>
			</tr>
			<#list model["users"] as user>
				<tr>
					<td>${user.firstname}</td>
					<td>${user.lastname}</td>
				</tr>
			</#list>	
		</table>
		
	</body>


</html>