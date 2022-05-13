package get.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BoardListServlet
 */
@WebServlet("/boardList")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");
		
		response.setContentType("text/html;charset=utf-8"); // 화면에 뿌려질 타입 : html
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>"); // html코드 작성
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		
		writer.println("page = " + page + "페이지 게시판 목록 출력");
	
		writer.println("</body>");
		writer.println("</html>");
		
		writer.close();
	}

}
