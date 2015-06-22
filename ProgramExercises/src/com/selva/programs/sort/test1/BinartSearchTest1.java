package com.selva.programs.sort.test1;

import java.util.Arrays;
import java.util.Scanner;

public class BinartSearchTest1 {

	static int[] x  = {2,33,452,54,213,22,33,45,12,34,232,133};
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int in = scanner.nextInt();
		System.out.println(Arrays.toString(x));
		bubbleSort();
		System.out.println(Arrays.toString(x));
		binarySearch(in,0, x.length -1);
		scanner.close();
	}
	private static void binarySearch(int in, int low , int high){
		
		int mid = low + (high - low)/2;
		System.out.println(x[low] + " " + x[mid] +" " + x[high]);
		while( low < high){
			
			if(in < x[mid]){
				high = mid -1;
			}else if(in > x[mid]){
				low = mid +1;
			}else{
				System.out.println(mid);
				break;
			}
			
			mid = low + (high -low)/2;
			System.out.println(x[low] + " " + x[mid] +" " + x[high]);
		}
		
		
	}
	private static void bubbleSort(){
		boolean flag = true;
		while(flag){
			flag = false;
			for(int i =0 ; i< x.length -1 ; i++){
				int j = i+1;
				if(x[i] > x[j]){
					swap(i,j);
					flag = true;
				}
			}
		}
		
		
	}
	private static void swap(int i, int j){
		int temp;
		temp = x[i];
		x[i] = x[j];
		x[j]= temp;		
	}
}
