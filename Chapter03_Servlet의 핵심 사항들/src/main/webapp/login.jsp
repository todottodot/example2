<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="sessionLogin" method="post"> <!-- action= 매핑명  -->
	<label id = "id">아이디:</label> &nbsp;&nbsp;&nbsp;
	<input type="text" name="id" id = "id"/>
	<br>
	
	<label id = "passwd">비밀번호 : </label> 
	<input type="password" name="passwd" id = "passwd" size="21" />
	<br><br>
	<input type="submit" value="로그인"/>
	</form>
</body>
</html>