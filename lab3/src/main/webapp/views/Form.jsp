<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
		<!DOCTYPE html>
		<html>

		<head>
			<meta charset="UTF-8">
			<title>Insert title here</title>
		</head>

		<body>
			<select name="country">
				<c:forEach var="ct" items="${countries }">
					<option value="${ct.name }">${ct.name }</option>
				</c:forEach>
			</select>
			<br>
			<table border="1">
				<thead>
					<tr>
						<th>No</th>
						<th>ID</th>
						<th>Name</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="ct" items="${countries }" varStatus="vs">
						<tr>
							<td>${vs.count }</td>
							<td>${ct.id }</td>
							<td>${ct.name }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</body>

		</html>