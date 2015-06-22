package com.selva.programs.sort.test2;

//factor(4) = 4 * 3 * 2 * 1 = 24 
// fibo(3) = 0 1 1 2 3 5 
public class FiboTest2 {

	public static void main(String[] args) {
		
//		for( int i = 0 ; i < 6 ; i++)
//		{
////			System.out.print(fibo(i) + " ");
//		}
//		System.out.print("\n" +fact(4));
		fibo(87);
	}
	private static void fibo(int n) {
		int fibo1 = 0, fibo2 = 1, fibo = 0;
		System.out.print(fibo1 + " " + fibo2);
		for(int i = 0 ; i < n ; i++){
			fibo = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibo;
			System.out.print(" "+fibo);
		}
	}
	
	private static int fact(int n){
		int fact = 1;
		for(int i = 1 ; i<= n ; i++){
			fact = fact * i;
		}
		return fact;
	}
}
