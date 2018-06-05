package com.itManage.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itMange.db.DbConnection;

/**
 * Servlet implementation class AddDivition
 */
@WebServlet("/AddDivition")
public class AddDivition extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDivition() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		//System.out.println(name);
		String check = request.getParameter("check").trim();
		//System.out.println(check);
		String pass = request.getParameter("pass");
		//System.out.println(pass);
		
		Connection conn;
		
		try {
		    if(check.equals("division")) {
			conn=DbConnection.getSqlConnection();
		
					
				
				PreparedStatement pst=conn.prepareStatement ("insert into division(div_name) values(?)");
				  
				pst.setString(1, name);
				
				 pst.execute();
				 pst.close();
				 conn.close();
		    }
		    
		    else if(check.equals("department")) {
				conn=DbConnection.getSqlConnection();
			
						
					
					PreparedStatement pst=conn.prepareStatement ("insert into department(dep_name,div_name) values(?,?)");
					  
					pst.setString(1, name);
					pst.setString(2, pass);
					
					 pst.execute();
					 pst.close();
					 conn.close();
			    }	
			
		    else if(check.equals("team")) {
				conn=DbConnection.getSqlConnection();
			
						
					
					PreparedStatement pst=conn.prepareStatement ("insert into team(t_name,dep_name) values(?,?)");
					  
					pst.setString(1, name);
					pst.setString(2, pass);
					
					 pst.execute();
					 pst.close();
					 conn.close();
			    }	
			
		    
		    
				
			
			
			
			
		} catch (Exception e) {
			
			System.out.println(e);
			// TODO: handle exception
		}
		
		
        
	}

}
