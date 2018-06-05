package com.itManage.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itManage.model.Employee;
import com.itMange.db.DbConnection;

/**
 * Servlet implementation class UpdateProfile
 */
@WebServlet("/UpdateProfile")
public class UpdateProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection conn=null;
		
		
		Employee emp=new Employee();
		
		try {
			conn=DbConnection.getSqlConnection();
			int id=Integer.parseInt(request.getParameter("uid"));
			emp.setEmp_uname(request.getParameter("u_name"));
			emp.setEmp_pass(request.getParameter("u_pass"));
			emp.setEmp_email(request.getParameter("mail"));
			emp.setEmp_address(request.getParameter("address"));
             
			PreparedStatement pst=conn.prepareStatement ("update emp set emp_uname=?,emp_pass=?,emp_email=?,address=? where emp_id=? ");
			  pst.setString(1, emp.getEmp_uname());
			  pst.setString(2, emp.getEmp_pass());
			  pst.setString(3, emp.getEmp_email());
			  pst.setString(4, emp.getEmp_address());
			  pst.setInt(5, id);
			  pst.execute();
		      pst.close();
		      
		  	PreparedStatement pst1=conn.prepareStatement ("update user_account set user_name=?,user_password=? where emp_id=? ");
			  pst1.setString(1, emp.getEmp_uname());
			  pst1.setString(2, emp.getEmp_pass());
			  pst1.setInt(3, id);
			  pst1.execute();
		      pst1.close();
		      conn.close();

	        	request.getRequestDispatcher("index.html").include(request, response);

		} catch (Exception e) {
		System.out.println(e);	// TODO: handle exception
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		doGet(request, response);
	}

}
