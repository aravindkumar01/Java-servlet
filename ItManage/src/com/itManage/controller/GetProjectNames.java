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

import com.google.gson.Gson;
import com.itManage.DaoConn.ServiceDao;
import com.itManage.model.Project;

/**
 * Servlet implementation class GetProjectNames
 */
@WebServlet("/GetProjectNames")
public class GetProjectNames extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Object> JSONROOT = new HashMap<String, Object>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetProjectNames() {
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

		List<Project> proList = new ArrayList<Project>();

		ServiceDao dao = new ServiceDao();
		try {
			proList = dao.proList();

			response.setContentType("application/json");

			Gson gson = new Gson();

			JSONROOT.put("Result", "OK");
			JSONROOT.put("Records", proList);
			String jsonNames = gson.toJson(JSONROOT);

			response.getWriter().print(jsonNames);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e);
		}

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
