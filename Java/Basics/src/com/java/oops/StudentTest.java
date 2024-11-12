package com.java.oops;

public class StudentTest {

//	int a=10;
	public static void main(String[] args) {
//		System.out.println(a);;
		Student.collegeName="AISSMS";
		Student s1=new Student(2107144, "Nikhil Bankar", " Pune", 67552);
		Student s2=new Student(2107145, "Abhijeet Mowade", " Yawatmal");
		
//		s1.college="AISSMS";
		s1.displayDetails();
		s2.displayDetails();
	}
}
