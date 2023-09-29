package com.practice;
import java.util.Scanner;

public class Perfect1 {

		boolean Method(int a){
				for(int i=1; i*i<a; i++){
					
						if ((i*i)==a){
							return true;
						}
				}
				return false;

		}

			public static void main(String[] args){
				
				Scanner sc= new Scanner(System.in);


				System.out.println("Enter number whic you want to check");
					int a=sc.nextInt();

					Perfect1 obj=new Perfect1();
				System.out.println(obj.Method(a));
					
					
			
		}

	
}
