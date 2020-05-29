package d20200422;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// now.do - 서블릿을 실행하면 브라우저에 현재 시각

@WebServlet("/w20200422/now.do")
public class ServletEx02 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	private void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY.MM.dd a hh:mm");		// a -> 오전/오후
		String now = sdf.format(date);
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>ServletEx02 Result</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>오늘의 시간은</h1>");
		out.println("<h1> " + now + "</h1>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
