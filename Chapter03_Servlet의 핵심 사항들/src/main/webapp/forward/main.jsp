<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>main.jsp 페이지</h1>
<!-- 서블릿에서 Dispatcher 방식 -->
<!-- RequestDispatcher dispatcher = request.getRequestDispatcher("menu.jsp");
	 dispatcher.forward(request, response); -->

<!-- jsp에서는 서블릿처럼 자바코드를 이용하지않고 액션태그 사용 (위의 기능과 같다.) 
      실행하면 주소표시줄의 주소가 변경되지 않는다.
	  즉, 하나의 요청임
	  따라서 'request영역을 공유'함 (-> 공유했으므로 menu.jsp영역에서 사용가능) -->
	<jsp:forward page="sub.jsp" /> <!-- 주소표시줄에 주소가 변경되지않음 -> 실제 처리는 sub.jsp에서 처리하지만 주소창에는 main.jsp에서 처리하는것처럼 보임 -->
	<!-- jsp의 포워딩 방식은 주소는 그대로이지만 페이지가 이동(sub.jsp로 이동)되는 방식임 -->
</body>
</html>