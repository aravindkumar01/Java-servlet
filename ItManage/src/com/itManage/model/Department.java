package com.itManage.model;

public class Department {
private String name;
private int dep_id;
private String div_name;
public String getDiv_name() {
	return div_name;
}

public void setDiv_name(String div_name) {
	this.div_name = div_name;
}

public String getName() {
	return name;
}

public int getDep_id() {
	return dep_id;
}

public void setDep_id(int dep_id) {
	this.dep_id = dep_id;
}

public void setName(String name) {
	this.name = name;
}

	
}
