package com.tnsc.tnsc.dayeight.abstraction;

public abstract class shape {
	protected float area;
	// abstract method
	abstract void calArea();
	 
	 //concrete method
	 void show()
	 {
		 System.out.println("Area of shape is "+area);
	 }

}
