package com.tns.day3;

public class EncapsulationDemo {

	public static void main(String[] args) {
	EncapsulationExample obj = new EncapsulationExample();
	obj.setAge(20);
	obj.setName("ranjith");
	obj.setSerialNum(100);
	
	obj.getAge();
	obj.getName();
	obj.getSerialNum();
	
	System.out.println(obj);
	
	

	}

}
