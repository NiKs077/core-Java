package com.java.basics;

public class WrapperClass {
	/* Wrapper classes are used to convert primitive -> Objects
	 * Wrapper classes are Integer, Character, Boolean, Double, Float etc
	 * 
	 * We are convert 
	 * Primitive -> Object(Boxing), Object -> Primitive(Unboxing)
	 * Primitive -> String, String -> Primitive
	 * Object -> String, String -> Object
	 * */
	
	
	
	public static void main(String args[]) {
		// Primitive -> Object, Object -> Primitive
		
		int x=100;
		Integer integer_x=Integer.valueOf(x);
		int y=integer_x.intValue();
		System.out.println(integer_x + " " + y);
		
//		primitive -> String , String -> Primitive
		double num=72.56;
		String num_str=Double.toString(num);
		double double_num=Double.parseDouble(num_str);
		System.out.println(double_num + " " + num_str + " " +num_str.length());
		
//		String -> Object, Object -> String
		long l_num=234564;
		Long c_lnum=Long.valueOf(l_num);
//		object -> string
		String c_str=c_lnum.toString();
//		string -> obj
		Long converted_long=Long.valueOf(c_str);
		
		System.out.println(c_str + " "+ converted_long);
		

		
		
//		To convert string to int we can use parse int method of wrapper class
		String s="3847564";
		int sa=Integer.parseInt(s);
		System.out.println(sa);
	}
	
	
	
}
