package d20200421;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿 생성 방법
// 1. HttpServlet 상송
// 2. do~ override
// 3. @WebServlet() : annotation


@WebServlet("/w20200421/gugudanOk.do")
public class Gugudan extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String dan1 = req.getParameter("dan");		
		int dan = Integer.parseInt(dan1);
		
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Login</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>입력한 단은 " + dan + "단 입니다.</h1>");
		out.println("<h1>" + dan + " 단" + "</h1>");
		for(int i = 1; i < 10; i++) {
			out.println("<h1>" + i + " * " + dan + " = " + i*dan + "</br> </h1>" );
			
		}
		out.println("</body>");
		out.println("</html>");
		
	}

}
