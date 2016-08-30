<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
aaabbbccc
	<s:property value="categorys"></s:property>
	<form name="f" method="post" action="/Struts2BBS/category_add_input.action">
		<table>
			<s:iterator value="categorys" var="category">
				<tr>
		  			<td><s:property value="#category.id"/></td>
		  			<td><s:property value="#category.subject"/></td>
		  			<td><s:property value="#category.content"/></td>
		  			<td><a href="/Struts2BBS/category_updateInput?id=<s:property value='#category.id' />">Update</a></td>
		  			<td><a href="/Struts2BBS/category_delete?id=<s:property value='#category.id' />">Delete</a></td>
		  		</tr>
			</s:iterator>
			<tr>
				<td><a href="/Struts2BBS/category_add_input.jsp">Add</a></td>
			</tr>
		</table>
	</form>
</body>
</html>