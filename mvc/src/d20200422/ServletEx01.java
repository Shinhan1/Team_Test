package d20200422;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿 작성 방법 복슴
// 1. HttpServlet을 상속받기

// 3. WebServlet 주소
@WebServlet("/w20200422/wednesday.do")
public class ServletEx01 extends HttpServlet {
// 2. do ~ method override
	
	@Override
	// doGet -> get방식이기 때문에 post를 받지 않음 405 에러
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	// get과 post 어떤 방식으로 들어오던지 다 받을 수 있도록 처리
	private void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 필요한 로직 작성

		// encoding
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");

		// 사용자로부터 전달받은 메시지를 출력하기 위한 변수 생성
		// msg 변수에 사용자가 parameter에 담아서 보낸 데이터를 대입
		String msg = req.getParameter("msg");

		// 출력 객체
		PrintWriter out = resp.getWriter();

		// 출력
		out.println("<html>");
		out.println("<head>");
		out.println("<title>ServletEx01 Result</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Today is Wednesday</h1>");
		out.println("<h1> " + msg + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
