package com.selva.programs.sort.test2;

import java.util.Arrays;

public class InsertionSortTest2 {
	
	static int[] x = {2,45,34,56,78,97,34,12,2,23,35,67};
	public static void main(String[] args) {
		
		insertionSort();
		System.out.println(Arrays.toString(x));
	}

	private static void insertionSort(){
		
		for(int i=0 ;i < x.length-1 ; i++){
			
			for(int j = i ; j> 0 ; j--){
				
				if(x[j] > x[j+1]){
					swap(j, j+1);
				}
			}
			
		}
		
	}
	private static void swap(int i , int j){
		
		int temp = x[i];
		x[i] = x[j];
		x[j] = temp;
		
	}
}
