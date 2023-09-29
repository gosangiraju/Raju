package com.Sortings;

public class MergeSort {
	
	static int[] Merge(int[] arr,) {
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				arr[k]=arr1[i];
				i++;
				k++;
			}
			else {
				arr[k]=arr2[j];
				k++;
				j++;
			}
		}
		while(i<arr1.length) {
			arr[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			arr[k]=arr2[j];
			k++;
			j++;
		}
		
	}

	public static void main(String[] args) {
		int[] arr1= {1,4,6,9,10};
		int[] arr2= {3,6,7,8,11};
		int size=arr1.length+arr2.length;
		int[] arr=new int[size];
		
		System.out.println(Merge(arr));

		
		
	}

}
