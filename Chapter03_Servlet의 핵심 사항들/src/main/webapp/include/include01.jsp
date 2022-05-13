<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");  /* 한글깨짐방지 */
%>

<%  
	/*flush="false"(기본값) 
		flush 속성 : JSP 페이지는 출력할 내용을 버퍼(8kb)에 저장하는데
		포함될 페이지로 제어가 이동할 때 버퍼의 처리 방식을 속성 값으로 지정
		 - true: 현재 페이지가 버퍼에 저장한 내용을 웹 브라우저에 출력하고 버퍼를 비움
		 - false: 결과를 합쳐서 출력하기 전까지 버퍼에 출력 내용을 저장
		
		<include 액션 태그 처리 과정>
		1.웹 브라우저가 a.jsp 페이지를 서버에 요청
		2.서버가 a.jsp 처리, 페이지 내부의 출력 내용을 버퍼에 저장하는 등의 작업을 함
		3.<jsp:include page="b.jsp" flush="false"/>
		액션 태그를 만나면 작업을 멈추고 b.jsp로 프로그램 제어를 이동시킴
		4.b.jsp 페이지 처리, 해당 페이지 내의 출력 내용을 출력 버퍼에 저장
		5.b.jsp 페이지의 처리가 끝나면 다시 a.jsp 페이지로 프로그램 제어가 이동
		이동 위치는 include 액션 태그의 다음 행
		6.a.jsp 페이지의 나머지 부분을 처리, 출력 내용을 버퍼에 저장
		7.출력 버퍼의 내용을 웹 브라우저로 응답
		
		※ include 액션 태그는 request 내장 객체를 공유하기 때문에
		a.jsp와 b.jsp는 동일한 request 객체를 사용하게 됨

    일반적으로 flush 속성을 false 로 지정하는 것이 좋다. 
    왜냐하면 하나의 jsp:include 액션태그의 flush 속성이 true로 설정되어 있다면 출력버퍼는 비워지고 
    모든 헤더정보를 웹브라우저에 전송하게 되는데 나중에 헤더정보를 추가하게 되면 반영될 수가 없다. 
    따라서 '템플릿페이지'로 사용되는 jsp:include 태그의 flush 속성을 false로 하여 진행하는 것이 좋다.*/
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>include01.jsp 페이지</h1>
	<hr/>
	
	<!-- 액션태그 내에 주석 사용 X (이유? 아래 4줄이 java로 변경될대 실행문 1줄로 변경되기때문)-->
	<jsp:include page="include02.jsp" flush="false">
		<jsp:param name="id" value="abc" />
		<jsp:param name="pw" value="123" />
	</jsp:include>
	
	<hr/>
	<h1>다시 include01.jsp 페이지</h1>
</body>
</html>