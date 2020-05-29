package d20200421;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet : 웹에서 동작하는 작은 자바 프로그램
// Servlet으로 만들어서 사용하려면 상속 받아서 씀

@WebServlet("/hello.html")		// 주소 앞에 / 빠지면 동작 x, 주소가 같은 파일이 있어도 동작 x
public class HelloSrvlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// req : 요청 객체
		// resp : 응답 객체
		
		PrintWriter out = resp.getWriter();		// 출력 용
		
		// html 형식으로 사용 가능함
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello Servlet </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello Servlet World</h1>");
		out.println("</body>");
		out.println("</html>");
		
		
		
		
	}
	

}
