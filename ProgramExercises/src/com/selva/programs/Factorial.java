package com.selva.programs;

import java.util.Scanner;
// f(4) = 4 * 3 * 2 * 1 = 24 
public class Factorial {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			System.out.println(factorial(num));
			scanner.close();
		}
		
		private static int factorial(int num){
			if(num ==1 ) return num;			
			
			return num * factorial(num -1 );			
		}
}
