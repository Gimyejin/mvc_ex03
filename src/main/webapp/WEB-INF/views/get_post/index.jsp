<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>get방식 전송</h1>
	<form action="${contextPath }/my/result" method="get">
		<input type="text" name="name" placeholder="name"><br>
		<input type="text" name="age" placeholder="age"><br>
		<input type="submit" value="전송"><br>
	</form>
	<hr>
	<h1>post방식 전송</h1>
	<form action="${contextPath }/my/result" method="post">
		<input type="text" name="name" placeholder="name"><br>
		<input type="text" name="age" placeholder="age "><br>
		<input type="submit" value="전송"><br>
	</form>
</body>
</html>