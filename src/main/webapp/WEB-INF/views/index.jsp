<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/boilerplate_spring_mvc_war/home">
		<label for="fname">User name:</label><br>
		<input type="text"
			id="fname" name="fname" value="Vu Loi"><br>
		<label
			for="fpass">Pass word:</label><br>
		<input type="password"
			id="fpass" name="fpass"><br> <br>
		<label>Address</label> </br>
		<input type="text" name="faddress" /> </br>
		<label>Email</label> </br>
		<input type="email" name="femail" /> </br>

		<label>Gender</label>
			<input type="radio" value="Nam" /> <label>Nam</label>
			<input type="radio" value="Nữ" /> <label>Nữ</label>

		</br>

		<label>Sở thích</label>

		<input type="checkbox" /> <label>Bơi lội</label>
		<input type="checkbox" /> <label>Nghe nhạc</label>
		<input type="checkbox" /> <label>Đi bộ</label>
		<input type="checkbox" /> <label>Xem phim</label>

		<label>Vị trí</label>
		<select>
			<option>Lập trình viên</option>
			<option>Lập trình viên</option>
			<option>Lập trình viên</option>
		</select>

		<input
			type="submit" value="Submit">
	</form>
</body>
</html>