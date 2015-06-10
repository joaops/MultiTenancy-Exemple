<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>staff_list</title>
</head>
<body>
	<form action="">
		<input type = "submit" value="查询">
	
	</form>
	
	<table>
		<tr>
			<th>编号</th>
			<th>年龄</th>
			<th>电话</th>
		</tr>
	</table>>
	
	<c:forEach items="${list}" var="staff">
		<tr>
			<th>${staff.id}</th>
			<th>${staff.name}</th>
			<th>${staff.telephone}</th>
		</tr>	
	</c:forEach>>
	
	


</body>
</html>