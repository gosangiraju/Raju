package com.practice;
import java.util.Arrays;
public class Practice2 {

	public static void main(String[] args) {
		String str3="hello kk ll";
		System.out.println(str3.replace('l','k'));
		int num1=str3.length();
		String num3="";
		
		System.out.println(num1);
		String str4="HelLo";
		System.out.println(str3.compareToIgnoreCase(str4)+" Equals");
		
		String new1="asd,sdd,lkj,jkhn";
		
		String[] str1=new1.split(",");
		int[] int1= {1,2,3,4};
		System.out.println(int1.getClass());

		System.out.println(Arrays.toString(int1));
		
		System.out.println(Arrays.toString(str1));
		System.out.println(str1.getClass());
	}

}
