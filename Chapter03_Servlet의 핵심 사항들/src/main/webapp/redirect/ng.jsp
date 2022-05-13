<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	int age;
%>

<%
String age = request.getParameter("age");
%>

나이가 <%=age %>로 미성년자입니다.

<a href="requestex.jsp">처음으로 이동</a>
</body>
</html>