package com.itManage.model;

public class Task {
	
	public int t_id;
	public String t_name;
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String histroy;
	public String t_des;
	public int pro_id;
	public String p_name;
	public String create;
	public String assignee;
	public String status;
	public String date;
	public String ddate;
	public String getDdate() {
		return ddate;
	}
	public void setDdate(String ddate) {
		this.ddate = ddate;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getT_des() {
		return t_des;
	}
	public void setT_des(String t_des) {
		this.t_des = t_des;
	}
	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}public String getAssignee() {
		return assignee;
	}
	public String getCreate() {
		return create;
	}
	public void setCreate(String create) {
		this.create = create;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getHistroy() {
		return histroy;
	}
	public void setHistroy(String histroy) {
		this.histroy = histroy;
	}
	
	
	
}
