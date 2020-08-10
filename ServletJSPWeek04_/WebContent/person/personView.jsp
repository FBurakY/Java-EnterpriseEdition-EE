<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.List" %>
<%@ page import="_04.request.dispatch.model.Person" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
//bu kisim java kodu!

//PersonController.java 
//req.setAttribute("persons",personList);

List<Person> personList = (List<Person>)request.getAttribute("persons");

%>

<table>
	<%
		for(Person p : personList){
	%>
	<tr>
		<td><%=p.getName()%></td>
		<td><%=p.getSurname()%></td>
	</tr>
	
	<%
		}
	%>

</table>


</body>
</html>