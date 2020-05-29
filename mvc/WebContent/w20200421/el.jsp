<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el.jsp</title>
</head>
<body>
	<%-- EL(Expression Language)
	: JSP에서 저장 객체를 출력할 때 스크립틀릿(기술)을 전혀 쓰지 않을 수 있는 언어
							<% %>
	: 기본적으로 지원이 되므로 따로 설정할 것이 없음
	--> --%>
	
	<!-- ex) id 파라미터 값을 가져와서 출려 -->
	<%-- <%
		// 기존 방식
		String id = request.getParameter("id");
		out.println(id);
	%> --%>
	
	<!-- ex) 위와 같은 el 코드 -->
	<h2>${param.id }</h2>

</body>
</html>