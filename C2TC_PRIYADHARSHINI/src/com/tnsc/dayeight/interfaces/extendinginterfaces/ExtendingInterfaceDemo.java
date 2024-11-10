//multilpe inheritance
package com.tnsc.dayeight.interfaces.extendinginterfaces;

public class ExtendingInterfaceDemo implements ChildInterface {
	//override Child interface method
  public void print() {
	System.out.println("print method");
}
//override InterfaceOne method
   public void show() {
	   System.out.println("show method");
}
}
