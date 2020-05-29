package kr.co.goott.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Model 단

public class TestAction {
	
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("hello", "안녕하세요");
		return "/hello.jsp";
	}
	
}
