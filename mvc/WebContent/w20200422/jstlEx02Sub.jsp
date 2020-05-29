<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlEx02Sub.jsp</title>
</head>
<body>
	<%-- <c:if test="조건식">실행문</c:if> --%>
	
	<h1>
		<c:if test="${param.num1 - param.num2 >= 0}">${param.num1 }</c:if>
		<c:if test="${param.num2 - param.num1 > 0 }">${param.num2 }</c:if>
		
	</h1>
	<!-- 일반 if문과 달리 else if 구문이 없으므로 if구문을 계속 써야 함 -->
	

</body>
</html>