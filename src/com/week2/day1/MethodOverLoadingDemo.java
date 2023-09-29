package com.week2.day1;

public class MethodOverLoadingDemo {

	public static void main(String[] args) {
		Shape obj=new Shape();
		System.out.println("area: "+obj.ClaculateArea(3));
		System.out.println("area: "+obj.ClaculateArea(2, 4));
		System.out.println("area: "+obj.ClaculateArea(4, 20, 40));
	}

}
