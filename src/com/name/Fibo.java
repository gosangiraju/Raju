package com.name;
import java.util.Scanner;
import java.util.Arrays;
public class Fibo {


	public static void main(String[] args) {
		System.out.println("Hello");
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=1;
		int c;
		int fiboo=sc.nextInt();
		int[] arr= new int[5];
		arr[0]=0;
		arr[1]=1;
		int d=2;
		for(int i=0; i<fiboo; i++) {
			
			c=a+b;
			arr[d]=c;
			d++;
			a=b;
			b=c;
			
		}
		System.out.println(arr[5]);

	}

}
