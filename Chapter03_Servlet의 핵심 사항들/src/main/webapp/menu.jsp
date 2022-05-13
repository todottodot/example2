<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    session="true"%>
<!-- session="true" : JSP파일에서 HttpSession 사용여부 결정 (기본값이 true, 'session객체를 사용하고 있다'라는 의미) -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!-- jsp에서는 세션객체를 자동생성해주므로
GetNameServlet.java에서 처럼 HttpSession session = request.getSession()을 코딩할 필요없음 -->
<body>
<!-- 서블릿에서 로그인이 성공해서 세션영역에 id값이 저장되어 있으면 저장되어 있는 id값을 반환하여 id출력
     id값이 저장되어있지 않으면(즉, 로그인이 되어있지 않은 상태라면) null값이 반환되어 다시 login.jsp로 이동 -->
<% 
String id = (String)session.getAttribute("id"); // "java" (반환값이 Object타입이므로 String타입으로 형변환해줌)

if(id == null){
%>
	<a href="login.jsp">로그인</a>

<%
}else{
%>	
	<%=id %>님 환영합니다.
<%
}

%>
</body>
</html>