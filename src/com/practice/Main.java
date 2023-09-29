package com.practice;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		int startIndex=0;
		int endIndex=text.length()-1;
		System.out.println(isPalindrome(text,startIndex,endIndex));
		
	}
	static boolean isPalindrome(String text1,int a,int b) { // abkba,  2, 2
		if(a==b) 
			return true;
		
		if(text1.charAt(a) != text1.charAt(b))
			return false;
		
		return isPalindrome(text1,++a,--b);
		
	}

}


