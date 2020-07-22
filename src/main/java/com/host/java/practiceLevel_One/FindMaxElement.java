package com.host.java.practiceLevel_One;

public class FindMaxElement {

	public static void main(String[] args) {
	
		int[] arr = {0,6,4,3,9};
		
		findMaxElement(arr);
		
		findSecondElement(arr);
		
		findThirdMaxElement(arr);

	}
	
	public static void findMaxElement(int[] arr) {
		
		int max =0;
		
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i] > max) {
				
				max = arr[i];
			}
		}
	
		System.out.println("first max element is : "+max);
	}
	
	public static void findSecondElement(int[] arr) {
		int max = 0, max2 = 0;
		
		for(int i =0 ; i < arr.length; i++) {
			
			if(arr[i] > max) {
				
				max2 = max;
				max = arr[i];
			}else if(arr[i] > max2 && max2!=max) {
				max2 = arr[i];
			}
		}
		
		System.out.println("second Max element is : "+max2);
	}
	
	public static void findThirdMaxElement(int[] arr) {
		int max=0, max2 =0, max3 = 0;
		
		for(int i  = 0; i <arr.length; i++) {
			
			if(arr[i] > max) {
				
				max3 = max2;
				max2 = max;
				max = arr[i];
			}else if(arr[i] > max2 && max2 != max) {
				max3 = max2;
				max2 = arr[i];
			}else if(arr[i] > max3 && max3 != max2) {
				max3 = arr[i];
			}
		}
		
		System.out.println("Third Max element is : "+max3);
	}
	

}
