package com.tnsc.dayeight.interfaces.instanceofinterface;
//program to define factory method
public class PhoneFactory {
	public static Phone createPhone(String company) {
		if (company.equalsIgnoreCase("Samsung"))
			return new Samsung();
		else if (company.equalsIgnoreCase("Jio"))
			return new Jeo();
		return null;
}
}
