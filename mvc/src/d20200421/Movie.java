package d20200421;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/w20200421/movie.do")
public class Movie extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String name = req.getParameter("name");
		
		PrintWriter out = resp.getWriter();
		
		int sum = 0;
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Movie</title>");
		out.println("</head>");
		out.println("<body>");
		if(name.equals("정직한후보")) {
			out.println("<img src='./movie/m1.jpg' />");			// ./ : 나 자신	,	../ : 부모 폴더
		}else if(name.equals("작은아씨들")) {
			out.println("<img src='./movie/m2.jpg' />");
		}else if(name.equals("클로젯")) {
			out.println("<img src='./movie/m3.jpg' />");
		}else if(name.equals("기생충")) {
			out.println("<img src='./movie/m4.jpg' />");
		}else if(name.equals("남산의 부장들")) {
			out.println("<img src='./movie/m5.jpg' />");
		}
		out.println("</body>");
		out.println("</html>");
		
		
		
	}

}
