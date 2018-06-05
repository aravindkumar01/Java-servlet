package com.itManage.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itManage.DaoConn.ServiceDao;
import com.itManage.model.Project;
import com.itMange.db.DbConnection;
import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class AddProject
 */
@WebServlet("/AddProject")
public class AddProject extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddProject() {
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
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String name = (String) session.getAttribute("name");
		ServiceDao dao = new ServiceDao();
		Connection conn = null;
		Project pro = null;
		try {
			conn = DbConnection.getSqlConnection();
			pro = new Project();

			int userEmp_id = dao.findEmpId(name);

			int len = Integer.parseInt(request.getParameter("numEmp"));

			pro.setEmp_id(userEmp_id);
			pro.setP_name(request.getParameter("pname").trim());
			pro.setP_des(request.getParameter("pdes").trim());
			
			//mail
			dao.getmailId(name,pro.getP_name(),pro.getP_des());
			
			
			//mail
			PreparedStatement pst = (PreparedStatement) conn
					.prepareStatement("insert into project  (createEmp_id,p_name,p_des)values (?,?,?)");

			pst.setInt(1, pro.getEmp_id());
			pst.setString(2, pro.getP_name());
			pst.setString(3, pro.getP_des());
			pst.execute();
			pst.close();
			for (int i = 1; i <= len; i++) {
				
				int id = dao.findEmpId(request.getParameter("empname" + i + ""));
				int proid = dao.findProId(pro.getP_name());
				String emp_name = request.getParameter("empname" + i + "");
				String emp_role = request.getParameter("emprole" + i + "");
				PreparedStatement pst1 = (PreparedStatement) conn.prepareStatement(
						"insert into projectempdetail (emp_id,emp_name,emp_role,pro_id)values (?,?,?,?)");
				pst1.setInt(1, id);
				pst1.setString(2, emp_name);
				pst1.setString(3, emp_role);
				pst1.setInt(4, proid);

				pst1.execute();
				pst1.close();
			}
			conn.close();
			request.getRequestDispatcher("TeamLeader.html").include(request, response);

		} catch (Exception e) {

			System.out.println(e);
			// TODO: handle exception
		}

		doGet(request, response);
	}

}
