package com.week2.day11;

public class InheritanceA {
	public void findCircleArea(float num) {
		int n=(int)num;
		System.out.println(3.14*(num*num));
		}
}
class InheritanceB extends InheritanceA{
	public void findRectangleArea(int l, int b) {
		System.out.println(l*b);
		}
	
}

class InheritanceC extends InheritanceB{
	public void findTriangleArea(int b, int h) {
		System.out.println((1/2)*b*h);
	}
	public static void main(String[] args) {
		InheritanceC obj= new InheritanceC();
		InheritanceB obj1=new InheritanceB();
		InheritanceA obj2=new InheritanceA();
		obj.findTriangleArea(2,3);
		obj1.findRectangleArea(6,7);
		obj2.findCircleArea(7);
		obj.findCircleArea(7);
		
	}
	
}