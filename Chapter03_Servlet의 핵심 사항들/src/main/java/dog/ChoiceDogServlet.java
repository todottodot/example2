package dog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChoiceDogServlet
 */
@WebServlet("/choiceDog")
public class ChoiceDogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChoiceDogServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html; charset=utf-8"); // html파일로 응답하겠다; 문자는 utf-8로 설정하여 한글을 깨지지 않도록 하겠다.
		
		PrintWriter out = response.getWriter();
		
		// dog이라는 이름으로 전송되어 온 파라미터 값들을 문자열 '배열'로 리턴받음
		String[] dog = request.getParameterValues("dog");
		out.println("<html>"); // html코드 작성
		out.println("<head>");
		out.println("</head>");
		out.println("<body bgcolor='black'>");
		out.println("<table align='center' bgcolor='yellow'");
		out.println("<tr>");
			for(int i = 0; i < dog.length; i++) {
				out.println("<td>");
				// 이미지 출력
				out.println("<img src = '"+ dog[i] +"' />");
				out.println("</td>");
			}
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

}
