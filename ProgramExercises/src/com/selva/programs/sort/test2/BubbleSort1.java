package com.selva.programs.sort.test2;

import java.util.Arrays;

public class BubbleSort1 {

	static int[] x = {2,45,34,56,78,97,34,12,2,23,35,67};
	public static void main(String[] args) {
		
		bubbleSort();
		System.out.println(Arrays.toString(x));
	}
	
	private static void bubbleSort(){
		boolean swap = true;
		while(swap){
			swap = false;
			for(int i =0 ; i< x.length-1 ; i++ ){				
				if(x[i] > x[i+1]){
					swap(i, i+1);
					swap = true;
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
