<%@page import="bean.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sendObject.jsp</title>
</head>
<body>
	<!-- jsp - action tag
	MemberBean에 id : hong, pw : 1234를 담아서 forward 방식으로
	el2.jsp로 이동시켜보세요
	
	el2.jsp에서는 이 객체를 받아서 id, pw 값을
	1) el문법으로 출력해보세요
	2) 스크립틀릿으로 출력해보세요 -->
	
	<%-- <%
		MemberBean mb = new MemberBean();
		mb.setId("id");
		mb.setPw("1234");
	%> --%>
	
	<jsp:useBean id="vo" class="bean.MemberBean" scope="session" ></jsp:useBean>

	<jsp:setProperty property="id" name="vo" value="hong"/>
	<jsp:setProperty property="pw" name="vo" value="1234"/>
	<jsp:forward page="el2.jsp"></jsp:forward>
	
	

</body>
</html>