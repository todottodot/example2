package redirect.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirectServlet
 */
@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RedirectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		
		// request.getRequestDispatcher("menu.jsp").forward(request, response); // 한줄로 표현하기
		
		request.setAttribute("request", "requestValue");
		// 1. Dispatcher 방식
		request.getRequestDispatcher("redirect.jsp").forward(request, response);
		
		// 2. Redirect 방식
		// response.sendRedirect("redirect.jsp"); // 새로운 요청 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
