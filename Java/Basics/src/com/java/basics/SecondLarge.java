package com.java.basics;

public class SecondLarge {
	public  static void main(String[] args) {
		int arr[]= {2,3,1,4,7, 9};
		int max=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max) max=arr[i];
		}
		int sec_max=0;
		for(int j=0; j<arr.length;j++) {
			if(arr[j]<max && (sec_max==0 || arr[j]>sec_max)) {
				sec_max=arr[j];
			}
		}
		System.out.println("Second Max is " + sec_max);
	}
}
