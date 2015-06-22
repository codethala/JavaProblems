package com.selva.programs.sort.test2;

import java.util.Arrays;

public class SelectionSortTest2 {
	static int[] x = {2,45,34,56,78,97,34,12,2,23,35,67};
	public static void main(String[] args) {
		
		selectionSort();
		System.out.println(Arrays.toString(x));
	}

	private static void selectionSort(){
		int smallest = 0;
		for(int i = 0 ; i< x.length -1 ; i++){
			smallest = i;
			for(int j=i+1; j < x.length ; j++){
				if(x[j] < x[smallest]){
					smallest = j;
				}
			}
			if(smallest != i){
				swap(smallest, i);	
			}
		}
		
	}
	private static void swap(int i , int j){
		
		int temp = x[i];
		x[i] = x[j];
		x[j] = temp;
		
	}
}
