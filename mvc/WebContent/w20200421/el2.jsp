<%@page import="bean.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el2.jsp</title>
</head>
<body>
	<h1>el2.jsp</h1>
	<%-- <%
		Object obj = session.getAttribute("vo");
		if(obj != null) {
			MemberBean mb = (MemberBean)obj;
			out.println(mb.getId());			
		}
	%> --%>
	
	<!-- 위 자바 코드와 같은 EL 방식 -->
	<h2>ID : ${vo.id}</h2>
	<h2>PW : ${vo.pw}</h2>
	
	<!-- scope 찾아오는 순서가 있음 : page, request, session, application -->
	<!-- 빨리 정확하게 찾아오고 싶을 때는 : ~~ + Scope -->
	<h2>ID : ${sessionScope.vo.id }</h2>
	<h2>PW : ${sessionScope.vo.pw }</h2>
	
</body>
</html>