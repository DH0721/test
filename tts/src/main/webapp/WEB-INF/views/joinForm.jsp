<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/join" method="post">
	<table>
		<tr>
			<td>ID</td>
			<td><input type="text" name="adminId"></td>
		</tr>
		<tr>
			<td>PW</td>
			<td><input type="text" name="adminPw"></td>
		</tr>
		<tr>
			<td><input type="submit" name="가입"></td>
		</tr>
	</table>
</form>
<a href="/joinForm">관리자 가입</a>

</body>
</html>