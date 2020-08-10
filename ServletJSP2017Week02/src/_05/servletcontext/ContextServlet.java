package _05.servletcontext;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contextServlet")
public class ContextServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletContext context = getServletContext();
		// ServletContext context2 = getServletConfig().getServletContext();
		// context init parametreleri butun proje kapsaminda gecerlidir
		String pathInfo = context.getInitParameter("rootPath");

		ServletConfig config = getServletConfig();

		// init parametresini ServletConfig objesi uzerinden cektigimizde bu
		// durumda ilgili parametre Servlet e ait olmalidir
		// aksi durumda null olacaktir
		String name = config.getInitParameter("username");

		resp.getWriter().print(pathInfo + " " + name);

		//
		String realPath = context.getRealPath("/test.txt");
		System.out.println(realPath); 
		//
		String contextPath=context.getContextPath();
		System.out.println(contextPath);
		//
		String serverInfo=context.getServerInfo();
		System.out.println(serverInfo);
		//
		
	}
}

// @Override
// public ServletContext getServletContext() {
// return getServletConfig().getServletContext();
// }
