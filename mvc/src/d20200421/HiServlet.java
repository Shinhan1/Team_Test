package d20200421;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi.jsp")
public class HiServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		rsq : 요청 객체
//		resp : 응답 객체
		
		PrintWriter out = resp.getWriter();		// 출력 용
		
		// html 형식으로 가능함
		out.println("<html>");
		out.println("<head>");
		out.println("<title>hi</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hi Servlet World</h1>");
		out.println("<h1>한글은 안먹네 왜안먹지 zzz</h1>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
