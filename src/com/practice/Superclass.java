package com.practice;

public class Superclass {
	int Addvalue=10;
	int value=5;
	Superclass(int value){
		this.value=value;
		System.out.println("Hell");
	}
	

static class Subclass extends Superclass{
	int Addvalue=15;
	Subclass(int value,int addvalue){
		
		super(value);
		this.Addvalue=Addvalue;
	}
}
	public static void main(String[] args) {
		Subclass obj=new Subclass(3,6);
		

	}

}
