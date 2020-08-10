package _05.response.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/responseCookieServlet")
public class ResponseCookieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie usernameCookie = new Cookie("admin", "levent");
		resp.addCookie(usernameCookie);
	}
}

// cookieler , son kullanincin bilgisayarinda saklanan (browser tarafindan)
// kucuk bilgilerdir.
// cookieler ozel headerlerdir.
//