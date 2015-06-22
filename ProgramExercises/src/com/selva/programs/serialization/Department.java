package com.selva.programs.serialization;

import java.io.Serializable;

public class Department implements Cloneable, Serializable{
	
	String deptId;
	String deptName;
	public Department(String deptId, String deptName){
		
		this.deptId =  deptId;
		this.deptName = deptName;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
