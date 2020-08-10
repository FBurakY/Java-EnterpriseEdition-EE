<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="employeeAttribute" class="_01.model.Employee" scope="request"/>

<p><jsp:getProperty property="id" name="employeeAttribute"/></p>
<p><jsp:getProperty property="name" name="employeeAttribute"/></p>
<p><jsp:getProperty property="salary" name="employeeAttribute"/></p>
<p><jsp:getProperty property="department" name="employeeAttribute"/></p>



</body>
</html>