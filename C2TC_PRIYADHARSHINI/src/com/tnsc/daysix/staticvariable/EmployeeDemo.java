package com.tnsc.daysix.staticvariable;

public class EmployeeDemo {

	public static void main(String[] args) {
//create the first object of the class and pass	the two arguments with type 
		//string and int.
		//System.out.println(Employee.companyName);
		Employee e = new Employee("Priya",123);
		System.out.println(e);
		//similarly  create the second object of the class and pass the two arguments.
		e=new Employee("jaya",231);
		System.out.println(e);
		
		}

}
