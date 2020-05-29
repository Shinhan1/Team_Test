package d20200423;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/w20200422/cal1.do")
public class ServletEx03_Cal extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	private void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		// 클라이언트로부터 데이터를 전달받기
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		String oper = req.getParameter("oper");
		
		// 출력부
		PrintWriter out = resp.getWriter();
		
		// 사칙연산 계산부
		
		int result = 0;
		if(oper.equals("+")) {
			result = num1 + num2;
		}else if(oper.equals("-")) {
			result = num1 - num2;
		}else if(oper.equals("*")) {
			result = num1 * num2;
		}else if(oper.equals("/")) {
			if(num2==0) {
				out.println("<h1>0으로는 나눌 수 없습니다.</h1>");
			}else {
				result = num1 / num2;				
			}
		} // if end

		//HTML 형식으로 출력
		out.println("<html>");
		out.println("<head>");
		out.println("<title>ServletEx03 Result</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>" + result + "</h2>");
		out.println("</body>");
		out.println("</html>");
		
	}
	
	
}
