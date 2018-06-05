package com.itManage.model;

import java.sql.Timestamp;

public class Histroy {
	
	
	public int pro_id;
	public int t_id;
	public Timestamp time;
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public int empid;
	public int priority;
	public int day;
	public String histroy;
	public int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public int getEmpid() {
		return empid;
	}public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getHistroy() {
		return histroy;
	}
	public void setHistroy(String histroy) {
		this.histroy = histroy;
	}
	

}
