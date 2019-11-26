package com.hcl.bean;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Employee  implements java.io.Serializable{
	private int id;
	private String name;
	private int salary;
	private String designation;
	protected String insScheme;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsScheme() {
		return insScheme;
	}
	public void setInsScheme(String insurScheme) {
		this.insScheme = insurScheme;
	}
	@Override
	public String toString() {
		return "\nName :"+name+ "\nID :"+ id+"\nInsurance Scheme :" + getInsScheme();
	}
	
	
	

}
