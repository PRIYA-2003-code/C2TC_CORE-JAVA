package com.tnsc.daysix.usingfinal;

public class FinalVariable {
//final int x; final instance variable must be initialized
   final int x=100;
   //declare a static blank final variable
   final static int Y;
   // declare and initialized static final variable
   final static int Z=200;
   //instance method
   void change() {
	  // x = 30;(error)
	   //final variable can't be reassigned
    //  Y = 200; // final static variable can't be reassigned
      // @Override
        }
   	public String toString() {
   		return "FinalVariable [x=" + x + ", Y" + Y + "]";
   	}

   	// Declare a static block to initialize the final static variable.
   	static {
   		     Y = 20;
   		    // Z = 100;(error)
   		// Once intialized can't be reassigned
   		System.out.println("Value of Y: " + Y);
   	 }
   
}
