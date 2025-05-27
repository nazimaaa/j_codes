package com.tns.day8;

public class Employee {
	private String name;
	private int id;

	static String companyName="atria";

	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Company= "+companyName+"]";
	}


}
