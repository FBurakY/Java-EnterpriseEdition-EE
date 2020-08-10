package _01.getRequest.params;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requestGetForm")
public class RequestGetForm extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("RequestPostForm#doPost");

		//
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String gender = req.getParameter("gender");
		String maritalStatus = req.getParameter("marital status");
		String[] langs = req.getParameterValues("lang");

		PrintWriter pw = resp.getWriter();
		pw.println(firstName);
		pw.println(lastName);
		pw.println(gender);
		pw.println(maritalStatus);
		pw.println(Arrays.asList(langs));

		Map<String, String[]> parameterMap = req.getParameterMap();

		for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
			System.out.println(entry.getKey() + " " + Arrays.asList(entry.getValue()));
		}

	}

}
