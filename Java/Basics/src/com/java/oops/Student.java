package com.java.oops;

public class Student {
//this class is for use of static and this keyword
	static String collegeName="DYPIET";
	
	int id;
	String name;
	String address;
	int fees;
	String college;
	public Student(int id, String name, String address) {
		this.id= id;
		this.name= name;
		this.address= address;
		this.college=Student.collegeName;
	}
	public Student(int id, String name, String address, int fees) {
		this(id,name,address);
		this.fees= fees;
	}
	public void displayDetails(){
		if(this.checkIfFeesPaid()); System.out.println(this.id + " "+ this.name + " "+ this.address + " "+ this.college + " "+ this.fees);
	}
	public boolean checkIfFeesPaid() {
		if(this.fees>5000) return true;
		return false;
	}
	
	
	
	
}
