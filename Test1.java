package com.oops.demo;

public class Test1 {
	private String firstName;
	private String lastName;
	
public Test1() {
	
}
	
public Test1(String firstName,String lastName) {
	this.firstName=firstName;
	this.lastName=lastName;
	
}

public void setFirstName(String firstName) {
	this.firstName=firstName;
}
public void setLastName(String lastName) {
	this.lastName=lastName;
}
public String getFirstName() {
	return firstName;
	
}
public String getLastName() {
	return lastName;
}
@Override
public String toString() {
	return "firstName: "+firstName + "lastName:"+lastName;
}
}