<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlEx05.jsp</title>
</head>
<body>
	<%
		int num1 = 100, num2 = 0;
	%>
	<c:catch var="e">
	<%
		int result = num1/num2;
	%>
		<h2>나눗셈의 결과는? <%= result %></h2>
	</c:catch>
	<c:if test="${e != null }">
		<h2>에러 메시지 : / by zero</h2>
		<h2>에러 메시지 : <c:out value="${e.message }"></c:out></h2>
	</c:if>
	
	
	<!-- 페이지 이동 -->
	<c:redirect url="http://search.naver.com/search.naver">
		<c:param name="query" value="4월 제철 음식"></c:param>
	</c:redirect>
	
	
</body>
</html>