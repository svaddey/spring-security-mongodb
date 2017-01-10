
    <%@ page session="false"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    <csrf disabled="true"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
    <div align="center">



        <form action="addTicket" method= "POST">
        <table>
        			<tr>
        				<td>Id:</td>
        				<td><input type='text' name='id' value=''></td>
        			</tr>
        			<tr>
        				<td>Description:</td>
        				<td><input type='text' name='description' /></td>
        			</tr>
        			<tr>
                            				<td>Id:</td>
                            				<td><input type='text' name='createdBy' value=''></td>
                    </tr>
                    <tr>
                            				<td>Id:</td>
                            				<td><input type='text' name='createdDate' value=''></td>
                            			</tr>

        			<tr>
        				<td colspan='2'><input name="submit" type="submit" value="submit" /></td>
        			</tr>
        		</table>
        </form>
    </div>
</body>
</html>