<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head></head>

<body>
	<h1>Login</h1>

	<form:form name='f' action="login" method='POST'>

		<table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td>Remember Me:</td>
				<td><input type="checkbox" name="remember-me" /></td>
			</tr>
			<tr>
				<td><input name="submit" type="submit" value="Submit" /></td>
			</tr>
		</table>

	</form:form>

</body>
</html>