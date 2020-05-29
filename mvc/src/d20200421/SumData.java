package d20200421;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/w20200421/sumData.do")
public class SumData extends HttpServlet {
	// 사용자가 입력한 값까지의 합을 출력해 보세요.
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String d = req.getParameter("txt");
		int data = Integer.parseInt(d);
		
		PrintWriter out = resp.getWriter();
		
		int sum = 0;
		out.println("<html>");
		out.println("<head>");
		out.println("<title>SumData</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>입력한 값은 " + d + " 입니다.</h1>");
		for(int i = 1; i <= data; i++) {
			sum += i;
			//out.println("<h1> => " + sum + "</br> </h1>" );
		}
		out.println("<h1>합은 " + sum + "</h1>");
		out.println("</body>");
		out.println("</html>");
		
		
		
	}
	
	
}
