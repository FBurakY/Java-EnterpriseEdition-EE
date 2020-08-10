package _01.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.sun.xml.internal.ws.resources.HttpserverMessages;

//1 ) javax.servlet.Filter arabirimini implements et!
public class LogFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		
		// filter yardimiyla araya girip (intercept)
		
		// loglama
		// parametrelerin kontrolu
		//
		
		HttpServletRequest req = (HttpServletRequest) request;

		String IP = req.getRemoteAddr();
		System.out.println("IP : " + IP);
		
		
		chain.doFilter(request, response);

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
