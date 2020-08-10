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

<c:forEach begin="1" end="10" var="number">
	<p><c:out value="${number}"/></p>
</c:forEach>

<h1> ARRAY</h1>
<%
int [] numbers=  { 1,5,6,7,3,7,83,1,2};
request.setAttribute("numberArray", numbers);
%>

<c:forEach var="i" items="${numberArray}">
	 ${i},
</c:forEach>

<p></p>

<c:forEach var="i" items="${numberArray}" varStatus="loopStatus">
	 <p>${loopStatus.index} , ${i}</p>
</c:forEach>

	<h1>LIST</h1>
   <%
        java.util.List<String> myList = new java.util.ArrayList<String>();
        myList.add("element1");
        myList.add("element2");
        myList.add("element3");

        request.setAttribute("myListAttribute", myList);
    %>
	
	<c:forEach var="e" items="${myListAttribute}">
		${e},
	</c:forEach>

<p></p>

	<h1>MAP</h1>
    <%
        java.util.Map<String, String> myMap = new java.util.HashMap<String, String>();
        myMap.put("key1", "value1");
        myMap.put("key2", "value2");
        myMap.put("key3", "value3");

        request.setAttribute("myMapAttribute", myMap);
    %>

	<c:forEach var="entry" items="${myMapAttribute}">
		<p>${entry.key} , ${entry.value}</p>
	</c:forEach>

<h1>forTokens</h1>

<c:forTokens items="key1,key2,key3,key4" delims="," var="element">
	<p>${element}</p>
</c:forTokens>


</body>
</html>