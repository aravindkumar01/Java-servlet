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
import com.itManage.model.Employee;


/**
 * Servlet implementation class ViewEmployee
 */
@WebServlet("/ViewEmployee")
public class ViewEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Object> JSONROOT = new HashMap<String, Object>();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
/*String action = request.getParameter("action");
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		response.setContentType("application/json");
		List<Employee> empList=new ArrayList<Employee>();
		//String action="list";
		ServiceDao dao=new ServiceDao();
		if(action!=null)
		{
			
		
			try {   
				if(action.equals("list"))
				{
					empList=ServiceDao. empAll();

					JSONROOT.put("Result", "OK");
					JSONROOT.put("Records", empList);

					String jsonArray = gson.toJson(JSONROOT);

					response.getWriter().print(jsonArray);
				
				}
				else if (action.equals("create") || action.equals("update")) {
					Employee emp=new Employee();
					if (request.getParameter("emp_idNum") != null) {
						String emp_id = request.getParameter("emp_idNum");
					     emp.setEmp_idNum(emp_id);
					}

					if (request.getParameter("emp_fname") != null) {
						emp.setEmp_fname(request.getParameter("emp_fname"));
					}

					if (request.getParameter("emp_lname") != null) {
					  emp.setEmp_lname(request.getParameter("emp_lname"));
					}

					if (request.getParameter("dob") != null) {
						emp.setDob(request.getParameter("dob"));
					}
					
					if (request.getParameter("doj") != null) {
						emp.setDoj(request.getParameter("doj"));
					}
					if (request.getParameter("emp_gender") != null) {
						emp.setEmp_gender(request.getParameter("emp_gender"));
					}
					

					if (request.getParameter("emp_email") != null) {
						emp.setEmp_email(request.getParameter("emp_email"));
					}

					if (request.getParameter("emp_role") != null) {
						emp.setEmp_role(request.getParameter("emp_role"));
					}

					if (request.getParameter("emp_division") != null) {
						emp.setEmp_division(request.getParameter("emp_division"));
					}
					if (request.getParameter("emp_department") != null) {
						emp.setEmp_department(request.getParameter("emp_department"));
					}
					if (request.getParameter("emp_team") != null) {
						emp.setEmp_team(request.getParameter("emp_team"));
					}
					if (request.getParameter("emp_address") != null) {
						emp.setEmp_address(request.getParameter("emp_address"));
					}
					if (request.getParameter("emp_uname") != null) {
						emp.setEmp_uname(request.getParameter("emp_uname"));
					}
					if (request.getParameter("emp_pass") != null) {
						emp.setEmp_pass(request.getParameter("emp_pass"));
					}
					
				

					if (action.equals("create")) {
						
				          dao.addEmp(emp);
					} else if (action.equals("update")) {
						
						dao.updateEmp(emp);
					}

					// Return in the format required by jTable plugin
					JSONROOT.put("Result", "OK");
					JSONROOT.put("Record", emp);

					// Convert Java Object to Json
					String jsonArray = gson.toJson(JSONROOT);
					response.getWriter().print(jsonArray);
				}
				
				
				
				
				
			} catch (Exception e) {
				System.out.println(e);// TODO: handle exception
			}
		}*/
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
String action = request.getParameter("action");
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		response.setContentType("application/json");
		List<Employee> empList=new ArrayList<Employee>();
		//String action="list";
		ServiceDao dao=new ServiceDao();
		if(action!=null)
		{
			
		
			try {   
				if(action.equals("list"))
				{
					empList=ServiceDao. empAll();

					JSONROOT.put("Result", "OK");
					JSONROOT.put("Records", empList);

					String jsonArray = gson.toJson(JSONROOT);

					response.getWriter().print(jsonArray);
				
				}
				else if (action.equals("create") || action.equals("update")) {
					Employee emp=new Employee();
					if (request.getParameter("emp_id") != null) {
						int emp_id = Integer.parseInt(request.getParameter("emp_id"));
					     emp.setEmp_id(emp_id);
					}


					if (request.getParameter("emp_idNum") != null) {
						String emp_idNum = request.getParameter("emp_idNum");
					     emp.setEmp_idNum(emp_idNum);
					}

					if (request.getParameter("emp_fname") != null) {
						emp.setEmp_fname(request.getParameter("emp_fname"));
					}

					if (request.getParameter("emp_lname") != null) {
					  emp.setEmp_lname(request.getParameter("emp_lname"));
					}

					if (request.getParameter("dob") != null) {
						emp.setDob(request.getParameter("dob"));
					}
					
					if (request.getParameter("doj") != null) {
						emp.setDoj(request.getParameter("doj"));
					}
					if (request.getParameter("emp_gender") != null) {
						emp.setEmp_gender(request.getParameter("emp_gender"));
					}
					

					if (request.getParameter("emp_email") != null) {
						emp.setEmp_email(request.getParameter("emp_email"));
					}

					if (request.getParameter("emp_role") != null) {
						emp.setEmp_role(request.getParameter("emp_role"));
					}

					if (request.getParameter("emp_division") != null) {
						emp.setEmp_division(request.getParameter("emp_division"));
					}
					if (request.getParameter("emp_department") != null) {
						emp.setEmp_department(request.getParameter("emp_department"));
					}
					if (request.getParameter("emp_team") != null) {
						emp.setEmp_team(request.getParameter("emp_team"));
					}
					if (request.getParameter("emp_address") != null) {
						emp.setEmp_address(request.getParameter("emp_address"));
					}
					if (request.getParameter("emp_uname") != null) {
						emp.setEmp_uname(request.getParameter("emp_uname"));
					}
					if (request.getParameter("emp_pass") != null) {
						emp.setEmp_pass(request.getParameter("emp_pass"));
					}
					
				

					if (action.equals("create")) {
						
				          dao.addEmp(emp);
					} else if (action.equals("update")) {
						
						dao.updateEmp(emp);
					}

					// Return in the format required by jTable plugin
					JSONROOT.put("Result", "OK");
					JSONROOT.put("Record", emp);

					// Convert Java Object to Json
					String jsonArray = gson.toJson(JSONROOT);
					response.getWriter().print(jsonArray);
				}
				else if (action.equals("delete")) {
					if (request.getParameter("emp_id") != null) {
						int emp_id = Integer.parseInt(request.getParameter("emp_id"));
						
						dao.deleteEmp(emp_id);
						JSONROOT.put("Result", "OK");
           
						String jsonArray = gson.toJson(JSONROOT);
						response.getWriter().print(jsonArray);
					}
				
			}
				}
			catch (Exception e) {
				System.out.println(e);// TODO: handle exception
			}
		}
		//doGet(request, response);
	}

}
