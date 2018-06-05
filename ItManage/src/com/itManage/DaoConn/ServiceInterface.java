package com.itManage.DaoConn;

import java.util.List;

import com.itManage.model.Count;
import com.itManage.model.Department;
import com.itManage.model.Divitions;
import com.itManage.model.Employee;
import com.itManage.model.Project;
import com.itManage.model.Task;
import com.itManage.model.Team;
import com.itManage.model.User;

public interface ServiceInterface {

	public List<Divitions> getAll();
	public List<Department> findAll();
	public List<Team> listAll();
    void addUser();
    public List<Employee> empAll();
	public void addEmp();
	public void updateEmp();
    public void deleteEmp();		
    public List<Project> proList();
    public  int pro_id();
    public List<Task> listTask();
    public List<Employee> empTeamList();
    public List<User> userList();
	
	public int findEmpId();
	public int findProId();
	public List<Employee> empProjectDetail();
	public List<Task> listTaskId();
	public String getPname();
    public void status();
    public void newTask();
    public void getmailId();
    public void sentMail();

    public List<Count> countAll();
	
    public List<Task> allTask();
    


}
