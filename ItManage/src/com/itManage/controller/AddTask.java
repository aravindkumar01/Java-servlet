package com.itManage.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itManage.DaoConn.ServiceDao;
import com.itManage.model.Task;
import com.itMange.db.DbConnection;
import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class AddTask
 */
@WebServlet("/AddTask")
public class AddTask extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServiceDao dao;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddTask() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String createName = (String) session.getAttribute("name");
		
		Connection conn = null;
		Task task = null;
		ServiceDao dao = null;
		int create_id = 0;
		try {
			
			dao = new ServiceDao();

			create_id = dao.findEmpId(createName);

			task = new Task();
			 int pro_id=Integer.parseInt(request.getParameter("sProject"));
			 
			//int pro_id = dao.pro_id(name);
			 String pro_name=dao.getPname(pro_id).trim();
			conn = DbConnection.getSqlConnection();
			// System.out.println(pro_id);
			task.setDate(request.getParameter("date").toString().trim());
			task.setP_name(pro_name);
			task.setT_name(request.getParameter("tname").trim());
			task.setT_des(request.getParameter("tdes").trim());
			//task.setAssignee(request.getParameter("assignEmp").trim());
			String emp=request.getParameter("assignEmp").trim();
			if (emp.equals("Select")) {
				task.setAssignee("NULL");
			}
			else
			{
				task.setAssignee(emp);
			}
			
			task.setPro_id(pro_id);
			task.setCreate(createName);
			task.setStatus(request.getParameter("status").trim());
			task.setDdate(request.getParameter("ddate").toString());
			
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement(
					"insert into task  (t_name,pro_id,p_name,t_des,t_createAt,t_assignee,task_status,t_sdate,t_ddate)values (?,?,?,?,?,?,?,?,?)");

			pst.setString(1, task.getT_name());
			pst.setInt(2, task.getPro_id());
			pst.setString(3, task.getP_name());
			pst.setString(4, task.getT_des());
			pst.setString(5, task.getCreate());
			pst.setString(6, task.getAssignee());
			pst.setString(7, task.getStatus());
			pst.setString(8, task.getDate());
			pst.setString(9, task.getDdate());
			pst.execute();
			pst.close();

			conn.close();
			request.getRequestDispatcher("AssignTask.html").include(request, response);

		} catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		}

		doGet(request, response);
	}

}
