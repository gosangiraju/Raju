package com.practice;

import java.util.Scanner;

public class Practice{
	
	 boolean Method(int a){
		for(int i=1; i<a; i++){
				if ((i^i)==a){
					return true;
				}
		}
		return false;
	}
		
		
		public static void main(String[] args){

		System.out.print("Enter number whic you want to check");
			Scanner sc= new Scanner(System.in);
			int a=sc.nextInt();

		Practice obj=new Practice();
		obj.Method(a);
			
			
	}
}
		
		
	


