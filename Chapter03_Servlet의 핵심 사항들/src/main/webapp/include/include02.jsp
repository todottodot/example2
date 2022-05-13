<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
request.setCharacterEncoding("utf-8");  /* 한글깨짐방지 */
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>include02.jsp 페이지</h1>
	<!-- 전송된 데이터를 변수에 저장 -->
	<%
	/* form으로부터 전달받음 */
	String name = request.getParameter("name");
	
	/* include01.jsp로부터 전달받음 */
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	%>
	
	<!-- 출력 -->
	<%=name %>님 환영합니다. <br/>
	아이디  : <%=id %><br/>
	비밀번호 : <%=pw %>
</body>
</html>