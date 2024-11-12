package com.java.basics;

import java.util.Scanner;

public class PrimeNumbers {
	
	private static void printPrimeBetween_1_to_100(int num) {
		
		for(int i=1; i<num;i++) {
			boolean isPrime=true;
			for(int j=2; j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) System.out.println("The number " + i + " is a prime number");
		}
		
	};
	private static boolean checkIsPrimeOrNot(int num) {
	
		for(int i=2; i<num;i++) {
			if(num%i==0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=sc.nextInt();
		PrimeNumbers.printPrimeBetween_1_to_100(num);
	System.out.println(checkIsPrimeOrNot(num));
	}




}
