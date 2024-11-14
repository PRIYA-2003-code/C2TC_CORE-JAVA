//program to demonstrate hierarchical Inheritance
package com.tnsc.dayfive.hierarchicalinheritance;

public class Person {
	System.out.println("Person class default constructor");
	name="Amit";
	city="Pune";


public Person(String name, String city) {
	this.name = name;
	this.city = city;
}
public String getName() {
	return getName();
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return getCity();
}

public void setCity(String city) {
	this.city = city;
}@Override
public String toString() {
	return "Person [name=" + name + ", city=" + city + "]";
}

}






