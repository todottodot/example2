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
String name =request.getParameter("name");

String str = request.getParameter("age");
age = Integer.parseInt(request.getParameter("age"));
%>

이름은 <%=name %>이고 <br>
나이가 <%=age %>로 성인입니다. <br>
나이가 <%=str %>로 성인입니다. <br>

<a href="requestex.jsp">처음으로 이동</a>
</body>
</html>