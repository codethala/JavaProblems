package com.selva.programs.serialization;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

public class Employee implements Cloneable, Serializable{
	Set set = new TreeSet();
	
	String empID;
	String empName;
	Department department;
	
	public Employee(String empID, String empName, Department department){
		this.empID = empID;
		this.empName = empName;
		this.department = department;
		
	}
	public Employee deepCopy(){
		Employee employee = null;
		try {
		
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(bos);
			out.writeObject(this);
			
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream in = new ObjectInputStream(bis);
			employee = (Employee)in.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return employee;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee cloned = (Employee)super.clone();
		cloned.setDepartment((Department) department.clone());
		return cloned;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
}
