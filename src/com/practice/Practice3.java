package com.practice;

public class Practice3 {

	public static void main(String[] args) {
		String str1;
		str1="Hi hello lly llu";
		System.out.println("a b c c c".replace('c', 'k'));
		
		String arr="zzx";
		System.out.println(arr.replace("zz", "y"));
		
		//substring()
		String string="java hello world";
		String string2=string.substring(5);
		
		System.out.println(string2);
		System.out.println(string.substring(0,4));
		
		//indexOf()
		String findIndex="Iam na Super Hero";
		String hek=null;
		System.out.println(findIndex.indexOf("hero"));
		System.out.println(findIndex.indexOf('a',7));
		//charAt()
		System.out.println(findIndex.charAt(0));
		System.out.println(findIndex.toLowerCase());
		System.out.println(findIndex.toUpperCase());
		System.out.println(hek+findIndex);
		// System.out.println(hek.concat(findIndex)); // throws NullPointerException 
		
		int a=5;
		float f=1.3f;
		double d=444.88d;
		long l=-23456789089L;
		System.out.println(string.valueOf(a)+" "+string.valueOf(a).getClass());
		System.out.println(string.valueOf(f));
		System.out.println(string.valueOf(d));
		System.out.println(string.valueOf(l));
		
		char c='j';
		char[] ch= {'j','a','v','a','k','i','g','e'};
		System.out.println(string.valueOf(c)); //"j"
		System.out.println(string.valueOf(ch)); //"java"
		System.out.println(string.valueOf(ch,0,5));  // arrayName-ch,  start index-3,  endIndex-7  output:javak
		
		
		String str6=new String("raju good guy");
		System.out.println(String.join("098", "Raju","Good","Bad")); //join method
		System.out.println(String.join(" ff ", findIndex,"Guts"));
		
		
		
		
	}

}
