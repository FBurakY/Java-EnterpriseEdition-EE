package _06.url.rewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/urlReWrite")
public class URLRewrite extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		HttpSession session = req.getSession();
		session.setAttribute("key", "object value");
		
		PrintWriter pw = resp.getWriter();
		
		String nonEncodedUrl="getSessionAttribute";
		//encodeURL metodu kullanmazsak cookie kapaliysa session'lari kullanamayiz!
		//cunku session bilgisi (session id) bilgisi default olarak cookie'ler araciligiyla tasinmaktadir.
		
		String  encodedUrl= resp.encodeURL("getSessionAttribute");
		//bu sekilde encodeURL metodunu kullandigimizda cookie browserda kapaliysa url sonuna JSESSIONID bilgisi eklenir!
		//cooke aciksa eklenmez!
		
		pw.print("<html><body>");
		pw.println("Giris - <a href=\"" + nonEncodedUrl + "\"> Click Here</a>.");
		pw.println("Giris Encoded - <a href=\"" + encodedUrl + "\"> Click Here</a>.");
		pw.print("</body> </html>");
		
		
	}
}
