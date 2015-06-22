package com.selva.programs;

public class BubbleSort {
	public static void main(String[] args) {
		Integer[] intArr = new Integer[] {2,4,2,12,14,2,1,3};
		bubbleSort(intArr);
	}
	
	private static void bubbleSort(Integer[] intArr){

		int len = intArr.length;
		
		for(int i = 0; i < len ; i++){
			for(int j = 1 ; j< len - i  ; j++){
				if(intArr[j-1] > intArr[j]){
					Integer temp = intArr[j-1];		
					intArr[j-1] = intArr[j];
					intArr[j] = temp;	
				}
			}
		}
		
		for(int i =0; i< intArr.length ; i++){
			
			System.out.print(intArr[i] + " ");
		}
		
	}
	
	private static void swap(Integer i , Integer j, Integer[] intArr){
		Integer temp = intArr[i];		
		intArr[i] = intArr[j];
		intArr[j] = temp;
	}
}
