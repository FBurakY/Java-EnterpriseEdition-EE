<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var="examResult" value="80" scope="request"/>
<c:set var="name" value="admin"/>

<c:if test="${examResult > 65 }">
	<p> sinavi gectin ! </p>
</c:if>


<c:if test="${name eq 'admin'}">
	<h1>welcome admin!</h1>
</c:if>


<% 
String result = (String)request.getAttribute("examResult");
if ( Integer.parseInt(result) > 65) {
%>
	<p>sinavi gectin java kontrol!</p>
<%}%>


<c:set var="salary" scope="request"  value="5000"/>

<c:choose>
	<c:when test="${salary < 1500}">
		<p> dusuk maas</p>
	</c:when>
	
	<c:when test="${salary < 4000}">
		<p>iyi maas </p>
	</c:when>
	
	<c:otherwise>
		<p>suleymanin maasi :) </p>		
	</c:otherwise>
</c:choose>

</body>
</html>