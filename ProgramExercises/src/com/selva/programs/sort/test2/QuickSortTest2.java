package com.selva.programs.sort.test2;

import java.util.Arrays;

public class QuickSortTest2 {
	static int[] x = {2,45,34,56,78,97,34,12,2,67,23,35,67};
	public static void main(String[] args) {
		quickSort(0 , x.length -1);
		System.out.println(Arrays.toString(x));
	}
	
	private static void quickSort(int low, int high){
		int i = low;
		int j = high;
		int pivot = low + (high - low)/2;
		while( i <= j){
			
			while(x[pivot] > x[i] ){
				i++;
			}
			while(x[pivot] < x[j] ){
				j--;
			}
			if( i <= j){
				swap(i,j);
				i++;
				j--;
			}
			if(low < j){
				quickSort(low, j);
			}
			if(i < high){
				quickSort(i , high);
			}
		}
		
	}
	private static void swap(int i , int j){
		
		int temp = x[i];
		x[i] = x[j];
		x[j] = temp;
		
	}

}
