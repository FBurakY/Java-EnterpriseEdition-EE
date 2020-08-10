package _01.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _01.model.Department;
import _01.model.Employee;

@WebServlet("/employee")
public class EmployeeController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//
		Department department = new Department();
		department.setId(100);
		department.setName("Software Engineering");		
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("anil yetisgin");
		employee.setSalary(5000);
		employee.setDepartment(department);
		//
		req.setAttribute("employeeAttribute", employee);
		
		//RequestDispatcher dispatcher = req.getRequestDispatcher("employee.jsp");
		//RequestDispatcher dispatcher = req.getRequestDispatcher("employeeUseBean.jsp");
		RequestDispatcher dispatcher = req.getRequestDispatcher("employeeExpressionLanguage.jsp");
		dispatcher.forward(req, resp);
		//
	
	}
}
