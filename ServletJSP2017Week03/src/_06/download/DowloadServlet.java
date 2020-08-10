package _06.download;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/downloadServlet")
public class DowloadServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("application/ms-excel");
		resp.setHeader("Content-Disposition", "attachment; filename=test.xlsx");

		// apache poi
		// https://poi.apache.org/
		// http://community.jaspersoft.com/project/jasperreports-library

		InputStream is = getServletContext().getResourceAsStream("myfolder/myexcel.xlsx");

		int read = 0;
		byte[] bytes = new byte[1024];
		ServletOutputStream sos = resp.getOutputStream();
		while ((read = is.read(bytes)) != -1) {
			sos.write(bytes, 0, read);
		}
		
		sos.close();
	}
}
