<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("utf-8"); // 한글깨짐방지
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%! // 멤버변수와 메서드 : 전역에서 사용가능함 
	int age; // 멤버변수
%>
<%
String name = request.getParameter("name");
%>

이름 : <%=name %> <!-- ★★ 주의 : 출력안되고 Redirect에 의해 바로 페이지 이동됨 -->

<%

// 두줄로 표현
// String str = request.getParameter("age"); // "25"
// age = Integer.parseInt(str); // "25" -> 25 (값을 비교하기위해 String타입을 int타입으로 형변환해줌)

// 한줄로 표현
age = Integer.parseInt(request.getParameter("age")); // 수로 변경한 이유 : 비교연산자로 수와 수를 비교하기위해서

if(age >= 20){
	// response.sendRedirect("pass.jsp"); // Redirect방식 : 기존의 request 사용 X, 새로운 request 사용 -> age값이 전달안됨
	
	// response.sendRedirect("pass.jsp?age=" + age +"&name=" + name); // age값이 전달안되는 문제 해결방법 : 새로운 요청에 age값을 담아서 넘겨줌
	                                //age =25&name=??? -> 한글이 깨지기 때문
	                                		
	response.sendRedirect("pass.jsp?age=" + age +"&name=" + URLEncoder.encode(name, "utf-8")); // 한글깨짐문제 해결방법 : 한글을 utf-8로 인코딩하여 전달
}else{
	response.sendRedirect("ng.jsp?age=" + age);
}
%>

</body>
</html>