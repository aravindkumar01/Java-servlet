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
import com.itManage.model.Task;
import com.itMange.db.DbConnection;
import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class UpdateTask
 */
@WebServlet("/UpdateTask")
public class UpdateTask extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTask() {
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
		//ring name = request.getParameter("name");
		HttpSession session = request.getSession();
		String createName = (String) session.getAttribute("name");
	
        Connection conn=null;
        Task task=null;
        ServiceDao dao=null;
        
        try {
        	
			conn=DbConnection.getSqlConnection();
        	task=new Task();
            dao=new ServiceDao();
        	int id=dao.findProId(request.getParameter("pname"));
        	int priority=Integer.parseInt(request.getParameter("Priority"));
        	int day=Integer.parseInt(request.getParameter("time"));
        	String responce=request.getParameter("texteditor").trim();
        	responce = responce.replaceAll("<p>", "");
        	responce = responce.replaceAll("</p>", "");
            String status=request.getParameter("status");
            int tid=Integer.parseInt(request.getParameter("tid"));
            dao.status(status,createName,request.getParameter("pname"),tid);
            
            String assignee=request.getParameter("assignee");
             int empid=dao.findEmpId(assignee);
            
            PreparedStatement pst1=(PreparedStatement) conn.prepareStatement(" update task set task_status='"+ status+"' where task_id='"+tid+"' ");
        
        	pst1.execute();
        	pst1.close();
        	
            
            
            
            
            
            
        	PreparedStatement pst=(PreparedStatement) conn.prepareStatement(" insert into task_update(pro_id,u_priority,u_days,u_response,t_id,u_empid) values(?,?,?,?,?,?)");
        	pst.setInt(1, id);
        	pst.setInt(2,priority);
        	pst.setInt(3,day);
        	pst.setString(4,  responce);
        	pst.setInt(5, tid);
        	pst.setInt(6, empid);
        	pst.execute();
        	pst.close();
        	conn.close();
        	request.getRequestDispatcher("empuser.html").include(request, response);

        	
        	
        	
		} catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		}
		
		
		
		
		
		doGet(request, response);
	}

}
