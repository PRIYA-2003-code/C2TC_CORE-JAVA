package com.tnsc.daysix.staticvariable;

public class Employee {
	//declare instance variable.
	private String name;
	private int id;
	//declare a static variable companyName with datatype String and assign value
	//TNS which is common for all the object.
	static String companyName="TNS";
	public Employee() {
		//
	}
	Employee(String name,int id){
		this.name=name;
		this.id=id;
	}
	//@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Company= "+companyName+"]";
	}

}
