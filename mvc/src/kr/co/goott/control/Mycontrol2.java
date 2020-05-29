package kr.co.goott.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.goott.action.Action;
import kr.co.goott.model.TimeAction;
import kr.co.goott.model.DBAction;
import kr.co.goott.model.IpAction;

@WebServlet("/mc2.do")
public class Mycontrol2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	private void doProcess(HttpServletRequest req, HttpServletResponse resp) {
		
		String cmd = req.getParameter("cmd");
		String viewPage = null;
		
		Action action = null;
		
		if(cmd == null || cmd.equalsIgnoreCase("time")) {
			action = new TimeAction();
			viewPage = action.execute(req, resp);
		}else if(cmd.equalsIgnoreCase("ip")) {
			action = new IpAction();
			viewPage = action.execute(req, resp);
		}else if(cmd.equalsIgnoreCase("select")) {
			action = new DBAction();
			viewPage = action.execute(req, resp);
		}
		
		// 페이지 이동
		RequestDispatcher rd = req.getRequestDispatcher(viewPage);
		
		try {
			rd.forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
