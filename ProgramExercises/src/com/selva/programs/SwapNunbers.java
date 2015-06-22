package com.selva.programs;

import java.util.Scanner;

public class SwapNunbers {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a = scanner.nextInt();
		System.out.println("Enter Second Number : ");
		int b = scanner.nextInt();
		System.out.println(" A : "+ a + " B : " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Swaped:  A : "+ a + " B : " + b);
		scanner.close();
	}

}
