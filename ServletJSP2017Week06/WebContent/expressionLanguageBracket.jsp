<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>${myMap.key1} </p>
<p>${myMap.key2} </p>
<p>${myMap.key3} </p>

<h1>bracket</h1>

<p> ${myMap['key1']}</p>
<p> ${myMap['key2']}</p>
<p> ${myMap['key3']}</p>

<h2>myList</h2>
<p> ${myList[0]}</p>
<p> ${myList['1']}</p>
<p> ${myList['2']}</p>
<p> ${myList['3']}</p>

</body>
</html>