package kr.co.goott.action;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IpAction {
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		// String ip - req.getRemoteAddr();
		
		InetAddress iad = null;
		String ip = null;
		
		try {
			iad = InetAddress.getLocalHost();
			ip = iad.getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		req.setAttribute("ip", ip);
		
		return "/ip.jsp";
		
		
	}

}
