<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="struts" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<struts:form action="login">
		<struts:label value="LoninSystem"></struts:label>
		<struts:textfield name="username" label="account"></struts:textfield>
		<struts:password name="password" label="password"></struts:password>
		<struts:submit value="LOGIN"></struts:submit>
	</struts:form>
</body>
</html>