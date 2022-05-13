<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 액션태그 내에 주석 사용 X (이유? 아래 4줄이 java로 변경될대 실행문 1줄로 변경되기때문)-->
<jsp:forward page="forward_param.jsp" >
	<jsp:param name="id" value="abc" />
	<jsp:param name="pw" value="123" />
</jsp:forward>
</body>
</html>