package com.itManage.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.itManage.DaoConn.ServiceDao;
import com.itManage.model.Department;
import com.itManage.model.Task;

/**
 * Servlet implementation class GetTaskNames
 */
@WebServlet("/GetTaskNames")
public class GetTaskNames extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Object> JSONROOT = new HashMap<String, Object>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetTaskNames() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServiceDao dao = new ServiceDao();
		
		HttpSession session = request.getSession();
		String name = (String) session.getAttribute("name");
		String pass=(String ) session.getAttribute("pass");
		List<Task> taskList = new ArrayList<Task>();
		try {

			
			String empName=dao.getEmpName(name, pass);
			
			taskList = dao.listTask(empName);
			
			response.setContentType("application/json");

			Gson gson = new Gson();

			JSONROOT.put("Result", "OK");
			JSONROOT.put("Records", taskList);
			String jsonNames = gson.toJson(JSONROOT);

			response.getWriter().print(jsonNames);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e);
		}

		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
