package com.java.basics;

/* 
* A leap year is a year that contains an additional day, February 29th, making it 366 days long instead of the usual 365 days. Leap years are necessary to keep our calendar in alignment with the Earth’s revolutions around the Sun.
A year is a leap year if “any one of ” the following conditions are satisfied: 
The year is multiple of 400.
The year is a multiple of 4 and not a multiple of 100.*/

public class LeapYear {
	static int checkLeap(int N){
		if(N%400 == 0  ||  (  N%4 ==0 && N%100 != 0) ) 
	     {
	         return 1;
	         
	     }
	         return 0;
	         
	     };
	public static void main(String[] args) {
		int N=400;
		System.out.println(checkLeap(N));
	}

}
