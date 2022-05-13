package session.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionLoginServlet
 */
@WebServlet("/sessionLogin")
public class SessionLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		// 아이디와 비번이 둘다 java이면 인증되었다고 가정하고
		if(id.trim().equals("java") && passwd.trim().equals("java")) {
			HttpSession session = request.getSession();// session객체 생성 (getSession() : 한번이라도 session객체를 만든적이 있으면 다시 안만들어줌, 없으면 새롭게 만들어줌)
			
			session.setAttribute("id", id); // "id"에 사용자가 입력한 id (java)를 저장
			
			/*
			 * 교재 p.143 참조
			 * 서블릿에서 "요청에 대한 응답을 다른 페이지에서 처리하도록 특정페이지(menu.jsp)로 이동(=포워딩)"하는 방법 - 2가지
			 *  1. Dispatcher 방식 
			 *     : 실행하면 주소표시줄의 주소가 변경되지 않는다.
			 *       즉, 하나의 요청임
			 *       따라서 'request영역을 공유'함 (-> 공유했으므로 menu.jsp영역에서 사용가능)
			 *       
			 *  2. Redirect 방식
			 *     : 실행하면 주소표시줄의 주소가 변경된다.
			 *       즉, 새로운 요청임
			 *       따라서 'request영역을 공유하지 못함' (-> 공유하지 못했으므로 menu.jsp영역에서 사용불가)     
			 */
			
			// RequestDispatcher dispatcher = request.getRequestDispatcher("menu.jsp"); // 두줄로 표현
			// dispatcher.forward(request, response);
			
			request.getRequestDispatcher("menu.jsp").forward(request, response); // 한줄로 표현하기

		}else { // 아이디와 비밀번호가 일치하지않으면
			out.println("<script>");
			out.println("alert('아이디나 비밀번호가 일치하지 않습니다.')");
			out.println("history.back()");  // login.jsp로 이동
			out.println("</script>");
		}
		
	}

}
