package com.itManage.controller;

import java.io.IOException;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itManage.DaoConn.ServiceDao;
import com.itManage.model.Employee;
import com.itMange.db.DbConnection;

import javafx.scene.control.PasswordField;

/**
 * Servlet implementation class NewEmployee
 */
@WebServlet("/NewEmployee")
public class NewEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NewEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = null;
		Employee emp = null;
		ServiceDao dao=new ServiceDao();
		try {
			
			/*
String a="";
MessageDigest md = MessageDigest.getInstance("MD5");

synchronized (md) {

md.reset();
byte[] hash = md.digest(a.getBytes("CP1252"));

StringBuffer sb = new StringBuffer();
for (int i = 0; i < hash.length; ++i) {
sb.append(Integer.toHexString((hash[i] & 0xFF) | 0x100).toUpperCase().substring(1, 3));
}

String password = sb.toString();
} 
*/			emp = new Employee();
			conn = DbConnection.getSqlConnection();
		    emp.setEmp_idNum(request.getParameter("idNum"));
			emp.setEmp_fname(request.getParameter("firstName").trim());
			emp.setEmp_lname(request.getParameter("lastName").trim());
			emp.setDob(request.getParameter("dob").toString());
			emp.setEmp_gender(request.getParameter("selectGender").trim());
			emp.setDoj(request.getParameter("doj").toString());
			emp.setEmp_uname(request.getParameter("userName").trim());
			emp.setEmp_pass(request.getParameter("password").trim());
			emp.setEmp_email(request.getParameter("Email").trim());
			emp.setEmp_division(request.getParameter("selectDiv").trim());
			emp.setEmp_department(request.getParameter("selectDep").trim());
			emp.setEmp_team(request.getParameter("selectTeam").trim());
			emp.setEmp_role(request.getParameter("selectDes").trim());
			emp.setEmp_address(request.getParameter("address").trim());
             
			PreparedStatement pst = conn.prepareStatement(
					"insert into emp(emp_fname,emp_lname,emp_gender,emp_email,emp_desiganation,emp_division,emp_department,emp_team,address,emp_dob,emp_doj,emp_idNum,emp_uname,emp_pass) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

			pst.setString(1, emp.getEmp_fname());
			pst.setString(2, emp.getEmp_lname());
			pst.setString(3, emp.getEmp_gender());
			pst.setString(4, emp.getEmp_email());
			pst.setString(5, emp.getEmp_role());
			pst.setString(6, emp.getEmp_division());
			pst.setString(7, emp.getEmp_department());
			pst.setString(8, emp.getEmp_team());
			pst.setString(9, emp.getEmp_address());
			pst.setString(10, emp.getDob());
			pst.setString(11, emp.getDoj());
			pst.setString(12, emp.getEmp_idNum());
			pst.setString(13, emp.getEmp_uname());
			pst.setString(14, emp.getEmp_pass());
			

			pst.execute();
			pst.close();
			
      		conn.close();

			dao.addUser(emp.getEmp_uname(),emp.getEmp_pass(),emp.getEmp_role());
			
      		request.getRequestDispatcher("registration.html").include(request, response);
			

		} catch (Exception e) {

			System.out.println(e);
			// TODO: handle exception
		}

	}

}
