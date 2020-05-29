<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlEx01Sub.jsp</title>
</head>
<body>
	<h2>jstlEx01Sub.jsp</h2>
	<!-- jstlEx01에 있는 변수의 값들을 받아 연산하여 출력해보세요 : el로 출력해보세요 -->
	
	<%-- <h3>${requestScope.num1 }</h3> --%>
	
	
	<h2>두 값의 합: ${requestScope.num1 + requestScope.num2 }</h2>
	<h2>두 값의 차: ${requestScope.num1 - requestScope.num2 }</h2>
	<h2>두 값의 곱: ${requestScope.num1 * requestScope.num2 }</h2>
	<h2>두 값의 몫: ${requestScope.num1 / requestScope.num2 }</h2>

</body>
</html>