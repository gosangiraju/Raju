package com.week2.day11;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class Employee {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("First Name: ");
		String str1=sc.nextLine();
		System.out.println("Last Name: ");
		String str2=sc.nextLine();
		System.out.println("Please Enter the Department\n1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
		int option=sc.nextInt();
		String dept="";
		
		switch(option){
			case 1: 
				dept="Technical"; break;
			case 2: 
				dept="Admin"; break;
			case 3:
				dept="Human Resource"; break;
			case 4:
				dept="Legal";
		}
		
		String s="1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()<>?";
		int k=s.length();

		String str11="";
		for(int i=0; i<6; i++) {
			Random random=new Random();
			str11+=s.charAt(random.nextInt(k));
			
		}
		
		System.out.println("Dear "+str1+" your generated credentials are as follows");
		
		System.out.println("Email  ---> "+str1+str2+"@"+dept+".com");
		
		System.out.println("Password --->"+str11);
	

	}

}
