<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach items="${listTen}" var="value">
		${value }
		<br>
		
		<br>
	</c:forEach>
	<c:choose>
		<c:when test="${thu == 2 }">Thứ 2</c:when>
		<c:when test="${thu == 3 }">Thứ 3</c:when>
		<c:when test="${thu == 4 }">Thứ 4</c:when>
		<c:when test="${thu == 5 }">Thứ 5</c:when>
		<c:when test="${thu == 6 }">Thứ 6</c:when>
		<c:when test="${thu == 7 }">Thứ 7</c:when>
		<c:otherwise>Chủ nhật</c:otherwise>
	</c:choose>
</body>
</html>