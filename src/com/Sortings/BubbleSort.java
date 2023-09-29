package com.Sortings;

import java.util.Arrays;

class BubbleSort{
	static int[] Sort(int[] arr){
		for(int i=arr.length-1; i>0; i--){
			for(int j=0; j<i; j++){
				if(arr[j]>arr[j+1]){
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args){
		int[] arr={1,56,-1,0,-3};
		System.out.println(Arrays.toString(Sort(arr)));
	}
}
