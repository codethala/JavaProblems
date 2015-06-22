package com.selva.programs.search.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//fibonacci 0, 1, 1, 2, 3, 5, 8
public class FiboTest {
	static Map<Long, Long> cache = new HashMap<Long, Long>();
	public static void main(String... args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of the series :");
		long n  = scanner.nextLong();
		for(long i = 0; i < n ;i++){
//			System.out.print(" " +fibo(i)+"  ");		
		}
		fiboLoop(6);
		scanner.close();
	}

	private static Long fibo(Long n){
		
		if(n == 0 || n== 1 ){
			return n;
		}
		if(cache.containsKey(n)){
			return cache.get(n);
		}else{
			Long fibo = fibo(n-1) + fibo(n-2);
			cache.put(n, fibo);
			return fibo;
		}
		 
	}
	private static void fiboLoop(int n){
	int fibo1 = 0, fibo2= 1, fibo= 1;
	System.out.print(" " + fibo1 + " " + fibo2);
		for(int i= 1;i<=n;i++){
			fibo = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 =fibo;
			System.out.print(" " + fibo+"" );
		}
		
	}
}
// 0 1 1 2 3 5 8
