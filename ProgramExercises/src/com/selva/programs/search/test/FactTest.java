package com.selva.programs.search.test;

import java.util.Scanner;

//factorial f(3) = 1 * 2 * 3 = 6
public class FactTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the series :");
		int n = scanner.nextInt();
//		System.out.println("Factorial("+n+") : " + fact(n));
		System.out.println("Factorial("+n+") : " + factLoop(n));
		scanner.close();
	}
	private static int fact(int n){
		if(n == 1 ||  n == 0){
			return 1;
		}
		return n * fact(n-1);		
	}
	
	private static int factLoop(int n){
		int fact = 1;
		for(int i = 1; i<= n;i++){			
			System.out.print( i + " * ");
			fact = fact * i;			
		}
		return fact;
	}

}
