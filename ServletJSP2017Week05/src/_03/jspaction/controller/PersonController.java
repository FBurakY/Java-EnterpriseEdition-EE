package _03.jspaction.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _03.jspaction.model.Person;

@WebServlet("/person")
public class PersonController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//
		//
		Person person1 = new Person("name1", "surname1", 20);
		//
		req.setAttribute("myPerson", person1);
		//
		//RequestDispatcher dispatcher = req.getRequestDispatcher("person.jsp");
		RequestDispatcher dispatcher = req.getRequestDispatcher("personUseBean.jsp");
		dispatcher.forward(req, resp);

	}
}
