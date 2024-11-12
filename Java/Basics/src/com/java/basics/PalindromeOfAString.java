package com.java.basics;

public class PalindromeOfAString {
	private static boolean checkForPalinDrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!= str.charAt(j)) {
			return false;
			}
			i++;
			j--;
			
		}
		return true;
	}
	
public static void main(String[] args) {
	boolean result=PalindromeOfAString.checkForPalinDrome("nikhil");
	
	 if(result) 
	 {System.out.println("Yes the string is palindrome"); 
	 }
	 else{
		 System.out.println("Yes the string is not palindrome");
	 }
}
}
