package kr.co.goott.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TimeAction {
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		// 현재 시간을 출력
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat(
				"YYYY.MM.dd.a hh:mm"
			);
	
		String time = sdf.format(d);
		
		req.setAttribute("time", time);
		
		return "/time.jsp";
	}
	
}
