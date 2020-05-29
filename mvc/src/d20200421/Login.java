package d20200421;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.security.krb5.internal.SeqNumber;

@WebServlet("/w20200421/loginOk.do")
public class Login extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 전달
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		// Encoding
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		// 출력용 객체 생성
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Login</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>당신의 아이디는 " + id + " 입니다.</h1>");
		out.println("<h1>당신의 비밀번호는 " + pw + " 입니다.</h1>");
		out.println("</body>");
		out.println("</html>");
		
		
		
		
		
	}
	
	

}
