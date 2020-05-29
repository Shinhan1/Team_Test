<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlEx03.jsp</title>
</head>
<body>
	<c:set var="visitor" value="2" scope="session" />
	<jsp:forward page="jstlEx03Sub2.jsp"></jsp:forward>

</body>
</html>