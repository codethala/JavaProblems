package com.selva.programs.serialization;

public class SerilaizeDeep {
	
	public static void main(String[] args) {
		
		Department department = new Department("1", "Maths");
		Employee employee = new Employee("1", "Selva ", department);
		Employee clones = employee.deepCopy();
		System.out.println(employee + "  " + employee.getDepartment());
		System.out.println(clones + "  " + clones.getDepartment());
			
	}

}
