package com.java.basics;


public class ObjectClass {
	static int nums[]=new int[5];
	public static void main(String[] args) {
		for(int i=0; i<5;i++) {
			nums[i]=i+1;
		}
		int nums1[]=nums.clone();
		System.out.println(nums.toString());
		System.out.println(nums.hashCode() + " " + nums1.hashCode());
		for(int i=0; i< nums.length;i++) {
			System.out.println(nums[i]);
		}
}
}