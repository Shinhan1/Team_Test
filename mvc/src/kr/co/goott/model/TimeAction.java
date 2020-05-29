package kr.co.goott.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.goott.action.Action;

public class TimeAction implements Action {
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub

		// 현재 시간을 출력
		Date d = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("YYYY.MM.dd a hh:mm");

		String time = sdf.format(d);

		req.setAttribute("time", time);

		return "/time.jsp";
	}

}
