package com.selva.programs;

public class SubSequence {
	
//	static int[] x = {-2,-7,-4};
//	static int[] x = {-11,-4,-7,-2};
//	static int[] x = {-4, 7,-2};
//	static int[] x = {0, -4, 7,-2};
	static int[] x = { 4, 7,-2};
	/**
	 * -4		= -4
	 * -4 + -7  = -11
	 * -4 -7 -2 = -13
	 * -7		= -7
	 * -7 - 2   = -9
	 * -2		= -2
	 */
	
	public static void main(String[] args) {
		
		System.out.println(findMaxSum() + "");
	}
	
	private static int findMaxSum(){		
		int maxSum = x[0], len = x.length, subSum = 0;		
		for(int i =0 ; i < len ; i++){
			subSum =  x[i]  ;
			System.out.println("SubSum " + i + " " + subSum);
			maxSum = subSum > maxSum ? subSum: maxSum ; //findMaxSum(subSum, maxSum);
			for(int j = i+1 ; j < len ; j++){
				subSum = subSum + x[j];
				System.out.println("SubSum " + i + " " + subSum);
				maxSum = subSum > maxSum ? subSum: maxSum ; //maxSum = findMaxSum(subSum, maxSum);
			}
		}		
		return maxSum;
	}
	
	
}
