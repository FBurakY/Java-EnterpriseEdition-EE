package _02.attribute;

public class Notes {

}

// cesitli scope lara biraktigimiz/ekledigimiz objeler ; attribute

// application
// Session
// Request
// PageScope

// ### Application Scope
// Servlet 
// getServletContext().setAttribute("key",object);

// JSP
// application.setAttribute("key", object);

// ### Session Scope
// Servlet
// request.getSession().setAttribute("key",object);

// JSP
// session.setAttribute("key", object);

// ### Request Scope

//servlet
// request.setAttribute

// jsp
// request.setAttribute

// ### Page Scope
// JSP icin gecerlidir.

// pageContext.setAttribute("key", object);
