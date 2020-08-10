package _02.ajax.json.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import _02.ajax.json.model.Person;
import _02.ajax.json.model.Result;

@WebServlet("/person.servlet")
public class PersonServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(req.getInputStream()));

		StringBuffer jsonData = new StringBuffer();
		String line = "";
		while ((line = br.readLine()) != null) {
			jsonData.append(line);
		}

		Gson gson = new Gson();
		//
		Person person = gson.fromJson(jsonData.toString(), Person.class);
		//
		System.out.println(person);
		//
		Result result = new Result();
		result.setMessage("Basarili! : " + person.getName());
		result.setReturnCode("200");
		
		String resultJSON = gson.toJson(result);
		System.out.println(resultJSON);
		//
		
		PrintWriter pw = resp.getWriter();
		pw.write(resultJSON);
		pw.close();
		

	}

}
