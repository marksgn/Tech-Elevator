package com.techelevator.person;

public class Person {

	String firstName;
	String lastName;
	int age;
	
	
	public Person() {
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
		
	}
	
	public boolean isAdult() {
		return age >= 18;
	}
	
	
	
}
