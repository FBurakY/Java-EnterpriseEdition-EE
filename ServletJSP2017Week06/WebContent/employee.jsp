<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import ="_01.model.Employee" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<p> <%= ((Employee)(request.getAttribute("employeeAttribute"))).getId() %> </p>
<p> <%= ((Employee)(request.getAttribute("employeeAttribute"))).getName() %> </p>
<p> <%= ((Employee)(request.getAttribute("employeeAttribute"))).getSalary() %> </p>
<p> <%= ((Employee)(request.getAttribute("employeeAttribute"))).getDepartment().getId() %> </p>
<p> <%= ((Employee)(request.getAttribute("employeeAttribute"))).getDepartment().getName() %> </p>


</body>
</html>