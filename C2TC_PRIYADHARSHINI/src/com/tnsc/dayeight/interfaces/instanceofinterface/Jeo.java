package com.tnsc.dayeight.interfaces.instanceofinterface;

public class Jeo  implements Phone{
	@Override
	public void call() {
		System.out.println("Calling using Jio");
	}

	@Override
	public void sms() {
		System.out.println("Messaging using Jio");

	}

}
