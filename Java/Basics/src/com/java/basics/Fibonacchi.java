package com.java.basics;

public class Fibonacchi {
	static void findFirstNFibNumbers(int num) {
		if(num== 0 ) {
		System.out.println(0);
		}else if(num==1) {
		System.out.println(1);
		}else {
			int n1=0;
			int n2=1;
			System.out.println(n1);
			System.out.println(n2);
			for(int i=0; i< num; i++) {
				int n3=n1+n2;
				System.out.println(n3);
				n1=n2;
				n2=n3;
			}
		}
		
		
	}
	public static void main(String[] args) {
		Fibonacchi.findFirstNFibNumbers(6);
	}
}