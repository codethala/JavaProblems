package com.selva.programs.sort;

import java.util.Arrays;

/**
 * 
	 int function Partition (Array A, int Lb, int Ub);
	 begin
		 select a pivot from A[Lb]...A[Ub];
		 reorder A[Lb]...A[Ub] such that:
		 all values to the left of the pivot are <= pivot
		 all values to the right of the pivot are >= pivot
		 return pivot position;
	 end;
	procedure QuickSort (Array A, int Lb, int Ub);
	 begin
		 if Lb < Ub then
		 M = Partition (A, Lb, Ub);
		 QuickSort (A, Lb, M - 1);
		 QuickSort (A, M, Ub);
	 end;

 * @author selvakumar.arumugam
 *
 */
public class QuickSort {
	
//	static int[] x = {6,5,4,3,2,1};
	static int[] x = {3, 4, 1, 2, 8, 6, 11, 23, 5, 9, 12, 56, 14, 10};
	
	public static void main(String[] args) {
		
		quickSort(0,x.length-1);
		System.out.println(Arrays.toString(x));
	}
	
	private static void quickSort(int low, int high){
		
		if( low >= high)
			 return;
		
		int i=low, j= high;
		int mid = low+(high-low)/2;
		int pivot = x[mid];
		while(i <= j){			
			while(x[i] < pivot){
				i++;
			}			
			while(x[j] > pivot){
				j--;
			}
			if(i <= j){
				int temp = x[i];
				x[i] = x[j];
				x[j] = temp;
				i++;
				j--;
			}		
//			System.out.println(" 1 " + Arrays.toString(x));
		}
		if(low < j){
			quickSort(low, j);
		}
		if(high > i){
			quickSort(i, high);
		}
		
	}
}
