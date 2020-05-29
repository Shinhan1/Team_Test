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

@WebServlet("/w20200422/cal.do")
public class cal extends HttpServlet {

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
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		String radio = req.getParameter("oper");
		
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Cal Result</title>");
		out.println("</head>");
		out.println("<body>");
		if(radio.equals("+")) {
			out.println("<h2>" + (n1+n2) + "</h2>");
		}else if(radio.equals("-")) {
			out.println("<h2>" + (n1-n2) + "</h2>");
		}else if(radio.equals("*")) {
			out.println("<h2>" + (n1*n2) + "</h2>");
		}else if(radio.equals("/")) {
			try {
				out.println("<h2>" + (n1/n2) + "</h2>");				
			} catch (Exception e) {
				out.println("<h2>0으로 나눌 수 없습니다.</br>다시 시도해주세요.</h2>");
			}
		}
		out.println("</body>");
		out.println("</html>");
		
	}
	
}
