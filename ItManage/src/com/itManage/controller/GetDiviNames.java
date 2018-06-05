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
import com.google.gson.GsonBuilder;
import com.itManage.DaoConn.ServiceDao;
import com.itManage.model.Divitions;


/**
 * Servlet implementation class GetDivi
 */
@WebServlet("/GetDivi")
public class GetDiviNames extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Object> JSONROOT = new HashMap<String, Object>();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetDiviNames() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServiceDao dao=new ServiceDao();
		List<Divitions> divList=new ArrayList<Divitions>();
		try {     
		           divList=dao.getAll();

		          
		         
		   		response.setContentType("application/json");

		           Gson gson = new Gson();
		           
		          JSONROOT.put("Result", "OK");
					JSONROOT.put("Records", divList);
					String jsonNames = gson.toJson(JSONROOT);
										
					response.getWriter().print(jsonNames);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e);
		}
		
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
