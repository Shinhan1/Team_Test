package d20200423;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

// 서블릿을 작성하는 방법 - 2
// 1. GenericServlet 상속
// 2. service(~req, ~resp) override
// 3. WebServlet annotation

@WebServlet("/service.do")
public class ServletEx04_Generic extends GenericServlet {

	@Override
	public void init() throws ServletException {
		// init() : 서블릿이 로딩 시 단 한 번 호출
		// 		  : 필요한 자원을 할당 - 서블릿 초기화
		System.out.println("서블릿이 초기화 될 때 호출");
	}
	
	
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// 서블릿이 초기화 된 후 클라이언트로부터 온 요청에 대한 서비스를 수행
		System.out.println("service() 수행 중...");
		
		resp.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Service Result</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>service() call : 서비스 메소드 호출 중</h2>");
		out.println("</body>");
		out.println("</html>");

	}
	
	@Override
	public void destroy() {
		// destroy() : 서블릿 객체가 더 이상 필요하지 않게 되면 메모리에서 제거
		System.out.println("서블릿이 메모리에서 제거될 때 호출");
	}
	
	
}
