package com.selva.programs.sort;

import java.util.Arrays;

public class BubbleSort {
 static int[] xarr = {6,5,8,13,1,4,3,2,1,8};
	public static void main(String[] args) {
		bubbleSort(xarr);
		System.out.println(Arrays.toString(xarr));
	}
	private static void bubbleSortLoop(){
		
		for(int i=0; i< xarr.length -1; i++){
			
			for(int j= i; j< xarr.length -1 ;j++){
				
				swap(i,j);
			}
		}
		
	}
	
	public static void bubbleSort(int[] x){
		boolean flag = true;
		while(flag){
			flag= false;
			for (int i = 0; i < x.length-1; i++) {
				int j = i+1;
				if(x[i] > x[j]){
					swap(x, i,j);
					flag = true;
				}
			}		
			
		}
				
	}
	
	private static void swap(int[] x , int i, int j){
		int temp = x[i];
		x[i] = x[j];
		x[j] =temp;
		
	}
	private static void swap(int i, int j){
		int temp = xarr[i];
		xarr[i] = xarr[j];
		xarr[j] =temp;
		
	}
}
