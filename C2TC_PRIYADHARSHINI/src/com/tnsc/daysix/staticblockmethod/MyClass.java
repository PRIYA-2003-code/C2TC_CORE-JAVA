package com.tnsc.daysix.staticblockmethod;

public class MyClass {
	private int section;//non-static variable
	private static int srNo;//static variable
	//static block
	static
	{
		System.out.println("******************Within Static Block***************");
		srNo = 1000;
		
	}
	//default constructor
	MyClass()
	{
		System.out.println("***********Within Default Constructor******************");
		srNo++;
		section++;
	}
	//@override
	public String toString() {
		return "MyClass[Serial No"+srNo+",Section"+section+"]";
		
		
	}
	//static method
	static void display()
	{
		System.out.println("Serial No"+srNo);
		//System.out.println("Section:"+section);;//cannot access in non static variable
	}
	

}
