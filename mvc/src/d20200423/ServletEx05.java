package d20200423;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet.php")
public class ServletEx05 extends HttpServlet {
	
	// 객체 직렬화를 위한 코드
	private static final long serialVersionUID = 1L;
	
	public ServletEx05() {}  // 추후 프레임워크에서 인식이 잘 안될 경우에 시도할 방법(?)
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().append("served : ").append(req.getContextPath());
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
		
	}
	
	
	
	
	
	
}
