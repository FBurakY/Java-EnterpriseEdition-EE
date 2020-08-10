<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List , java.util.ArrayList"%>
       
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Hello JSP world!</h1>

<%
//JSP scriptlet!
System.out.println("hello jsp file!");
List myList = new ArrayList();
%>

<%
 String user ="admin user"; //local degisken
%>


<%=user%>
<!-- 
expression sonrasinda ; noktali virgul KOYMA!
= i UNUTMA yoksa scriptlet olur.
< ile % arasinda bosluk olmasin.
 -->

<!-- JSP scriptlet ve JSP expression kodlari , translate islemi sonrasinda (jsp ->java)
ayni metot icerisinde yer alir. dolayisiyla tanimlanan degiskenler local degiskenlerdir.
 -->
 

 <%!
 //jsp declaration
 public int calculate(int n1 , int n2 ) {
	 return n1+n2;
 }
 %>

<%=calculate(10,50)%>


<!-- bu yorum html yorumu browserda gozukur -->

<%-- bu yorum developera ozeldir , browserda gozukmez --%>

</body>
</html>