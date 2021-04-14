<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    
    <c:out value="${message}"></c:out>
    <form method="POST" action="/check">
        <label>What is the code?</label>
        <input type="text" name="theCode">
        <button>Try Code</button>
    </form>

</body>
</html>