package _02.request.methods;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requestMethodServlet")
public class RequestMethodsServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Locale locale = req.getLocale();
		int localPort = req.getLocalPort();
		int serverPort = req.getServerPort();
		String remoteAddr = req.getRemoteAddr();
		ServletContext context = req.getServletContext();
		String hostname = req.getHeader("host");

		System.out.println(locale);
		System.out.println(localPort);
		System.out.println(serverPort);
		System.out.println(remoteAddr);
		System.out.println(hostname);

		Enumeration<String> headerNames = req.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String hname = headerNames.nextElement();
			String headerValue = req.getHeader(hname);
			System.out.println(hname + " " + headerValue);
		}
	}
}
