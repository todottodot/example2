package get.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login") // 매핑명
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    /*
     * 'GET 방식'으로 요청이 전송되어 올 경우 : 
     * 요청 파라미터값이 요청 URL에 붙어서 전송되므로
     * 클라이언트의 URLEncoding 방식 (login.html에서 <meta charset="UTF-8"> 설정)과 
     * 서버의 URLEncoding 방식(초기 환경설정(encoding -> web -> css files, html files..)을 "UTF-8"설정 했음)을 동일하게 지정하기만 하면
     * 한글이 제대로 처리되지만
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		response.setContentType("text/html;charset=utf-8"); // 화면에 뿌려질 타입 : html
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>"); // html코드 작성
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		
		writer.println("아이디 = " + id + "<br>");
		writer.println("비밀번호 = " + passwd + "<br>");
		
		writer.println("</body>");
		writer.println("</html>");
		
		writer.close();
	}

	/*
	 * 'POST 방식'으로 요청이 전송되어 올 경우 : 
	 * 요청 파라미터 값이 요청 body영역에 따로 인코딩되어 넘어오기 때문에
	 * URLEncoding 설정(환경설정) 만으로는 한글이 제대로 처리되지 않는다.
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * 따라서, request객체의 body영역의 인코딩 방식을 utf-8로 변경해줘야한다.
		 */
		response.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		response.setContentType("text/html;charset=utf-8"); // 화면에 뿌려질 타입 : html
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>"); // html코드 작성
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		
		writer.println("아이디 = " + id + "<br>");
		writer.println("비밀번호 = " + passwd + "<br>");
		
		writer.println("</body>");
		writer.println("</html>");
		
		writer.close();
	}
	
	

}
