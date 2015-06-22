package com.selva.programs.sort;

import java.util.Arrays;

public class InsertionSort {
	static int[] x = {2,33,44,23,21,45,67,89};
	public static void main(String[] args) {
		
//		insertionSort();
		selectionSort();
		System.out.println(Arrays.toString(x));
	}

	private static void insertionSort(){
		
		for(int i=1; i<x.length ; i++){
			
			for(int j = i ; j>0; j--){
				if(x[j] < x[j-1]){
					swap(j-1,j);
				}
			}
		}
		
	}
	
	private static void selectionSort(){
		
		for (int i = 1; i < x.length-1; i++) {
			int index = i;
			for(int j = i; j>0;j--){
				if(x[j] < x[j-1]){
					index = j;
				}
			}
			swap(index, i);
			
		}		
	}
	private static void swap(int i, int j){
		int temp;
		temp = x[i];
		x[i] = x[j];
		x[j]= temp;		
	}
}
