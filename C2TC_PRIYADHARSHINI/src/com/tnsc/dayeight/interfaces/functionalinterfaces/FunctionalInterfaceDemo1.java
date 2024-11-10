package com.tnsc.dayeight.interfaces.functionalinterfaces;

public class FunctionalInterfaceDemo1 {

	public static void main(String[] args) {
		GreetClass1  g = new GreetClass1();
		System.out.println(g.greet());

		//using Lambda Expression
		GreetInterface g1 = () -> {
			return "Good Afternoon";
		};

		System.out.println(g1.greet());	
		
}

}
