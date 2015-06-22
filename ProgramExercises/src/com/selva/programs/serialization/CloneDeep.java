package com.selva.programs.serialization;

public class CloneDeep {
	
	public static void main(String[] args) {
		Department department = new  Department("1", "Maths");
		Employee employee = new Employee("1", "Selva", department);
		try{
			Employee clonedEmployee = (Employee)employee.clone();
			System.out.println(employee + "  " + employee.getDepartment());
			System.out.println(clonedEmployee + "  " + clonedEmployee.getDepartment());
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}
	
	

}
