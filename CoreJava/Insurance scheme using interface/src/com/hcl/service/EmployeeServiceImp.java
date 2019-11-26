package com.hcl.service;

import com.hcl.bean.Employee;

public class EmployeeServiceImp implements EmployeeService{
	public Employee setScheme(Employee e){
		int sal=e.getSalary();
		String des=e.getDesignation();
		if(sal>=50000 && (des.equals("Manager") || des.equals("manager"))){
			e.setInsScheme("Scheme A");
		} else if((25000 < sal)&&(sal < 50000) && (des.equals("Developer")||des.equals("developer"))){
			e.setInsScheme("Scheme B");
		} else{
			e.setInsScheme("Scheme C");
		}
		return e;
	}

	
}
