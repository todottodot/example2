package session.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SetNameServlet
 */
@WebServlet("/setName")
public class SetNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetNameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ★ 서블릿에서만 1. 서버에서 첫번째 요청이면 세션영역 생성. 즉, 세션 객체 생성(중복되지않는 고유한 세션 아이디부여(예:#001)를 클라이언트마다 부여 1:1)
		HttpSession session =  request.getSession(); // 첫번째요청일 경우 : 새로운 세션아이디를 생성하고 부여해줌
		                                             // 두번째 요청일경우 : 새로운 세션아이디를 생성하지 않고
		
		// 2. 해당 세션 영역에 name이라는 속성이름으로 "홍길동"값을 저장
		session.setAttribute("name", "홍길동"); // session영역에 저장되어있음
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		
		out.println("<h1>이름 저장</h1>");
		
	}

}
