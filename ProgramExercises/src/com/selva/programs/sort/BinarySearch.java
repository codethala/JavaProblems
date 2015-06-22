package com.selva.programs.sort;

import java.util.Arrays;

public class BinarySearch {

	 static int[] x = {6,5,8,13,1,4,3,2,1,8};
	 public static void main(String[] args) {
		
		 BubbleSort bubbleSort = new BubbleSort();
		 bubbleSort.bubbleSort(x);
		 System.out.println("sorted : " + Arrays.toString(x));
		 binarySearch(11);
	}
	 
	 private static void binarySearch(int search){
		 int i = 0, j = x.length -1;
		 int mid = i + (j-i) /2;
		 while(i <= j){
			 if(x[mid] < search){
				i = mid+1; 
			 }else if(x[mid] > search){
				 j = mid -1;
			 }else{
				 System.out.println("location :" + mid);
				 break;
			 }
			 mid = i+(j-i)/2;
		 }
		 
	 }
}
