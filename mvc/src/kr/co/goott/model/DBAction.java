package kr.co.goott.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.goott.action.Action;

public class DBAction implements Action {
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		// DBMS로부터 데이터를 돌려받았다고 치고..
		req.setAttribute("uid", "scott");
		
		return "/db.jsp";
	}
	
}
