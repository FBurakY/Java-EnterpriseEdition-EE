package _04.request.dispatch.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _04.request.dispatch.model.Person;

@WebServlet("/person")
public class PersonController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		//
		// controller seviyesinde veritabani baglantisi direkt yapilmaz.

		// controller service layer a o da dao layer a erisir.
		//
		//
		Person person1 = new Person("levent", "erguder");
		Person person2 = new Person("test name", "test surname");
		Person person3 = new Person("test name", "test surname");
		Person person4 = new Person("test name", "test surname");

		List<Person> personList = new ArrayList<Person>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		// bu kisimlar query sonrasi veritabanindan gelsin!
		
		//request scope'a objeyi ekle!
		req.setAttribute("persons",personList);

		// bir istek karsilandiginda isin icine jsp dosyasini da katiyoruz.
		// yani istegi karsilarken hem servlet hem jsp dosyasindan faydalaniriz.
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/person/personView.jsp");
		dispatcher.forward(req, resp);

	}

}
