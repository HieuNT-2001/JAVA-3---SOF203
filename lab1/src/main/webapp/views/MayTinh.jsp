<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Máy tính</title>
</head>
<body>
	<form action="./MayTinhServlet" method="POST">
		<input type="number" placeholder="Mời nhập số A" name="soA">
		<input type="number" placeholder="Mời nhập số B" name="soB">
		<div>
			<button value="cong" name="action" type="submit" style="padding: 15px; margin-right: 15px; font-size: 30px">+</button>
			<button value="tru" name="action" type="submit" style="padding: 15px; margin-right: 15px; font-size: 30px">-</button>
			<button value="nhan" name="action" type="submit" style="padding: 15px; margin-right: 15px; font-size: 30px">x</button>
			<button value="chia" name="action" type="submit" style="padding: 15px; margin-right: 15px; font-size: 30px">/</button>
		</div>
		<p>Kết quả</p>
		<textarea rows="20" cols="50">${KETQUA}</textarea>
	</form>
</body>
</html>