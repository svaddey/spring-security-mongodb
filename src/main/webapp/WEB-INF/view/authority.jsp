<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head></head>

<body>
	<h1>This is the landing page for the approving authority</h1>

	<security:authorize access="isAuthenticated()">
		Username: <security:authentication property="principal.username" />
		Role: <security:authentication property="principal.authorities"/>
	</security:authorize>

	<security:authorize access="hasRole('ROLE_USER')">
		This text is only visible to a user
		<br/>
	</security:authorize>
	
	<security:authorize access="hasRole('ROLE_AGENT')">
		This text is only visible to an agent
		<br/>
	</security:authorize>
	
	<security:authorize access="hasRole('ROLE_AUTHORITY')">
		This text is only visible to an approving authority
		<br/>
	</security:authorize>


	<form:form name='f' action="logout" method='POST'>
		<input name="submit" type="submit" value="Logout" />
	</form:form>
	
</body>
</html>