<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<p>${cookie.username.value}</p>

<p><%=request.getMethod()%></p>

<p>${pageContext.request.method}</p>

<p><%=request.getHeader("host") %> </p>
<p> ${header.host}</p>

<p>${myAttribute}</p>
<p>${requestScope.myAttribute}</p>
<p>${sessionScope.myAttribute}</p>
</body>
</html>