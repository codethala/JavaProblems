package com.selva.programs;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args){
		
		ReverseNumber reverseNumber =new ReverseNumber();
		Scanner scanner = new Scanner(System.in);
		int intNum = scanner.nextInt();
//		System.out.println("4 / 10 : " + 4 / 10);
//		String rev = "";
//		System.out.println(reverseNumber.reverseInt(intNum,rev));
		System.out.println(reverseNumber.reverseInt(intNum));
//		System.out.println("Reverser : " + rev);
		scanner.close();
	}
	//1234
	// 1234 % 10 = 4
	// 4 * 10 + 3 = 43
	// 43 * 10 + 2 = 432
	// 432 * 10 + 1 
	// 1 % 10 = 0
		private int reverseInt(int num){
			int reverseInt = 0;
			while(num != 0){
				reverseInt = reverseInt *10 + (num % 10);
				num = num /10;
			}
			return reverseInt;
		}
		
		private String reverseRecInt(int num,String rev ){
			if(num  < 10){
				rev = rev + num + "";
				return num+"";
				
			}else{				
				rev = rev + num % 10 +"";		
				return  reverseRecInt( num / 10,rev);
			}
//			return reverseInt(num / 10)+(num % 10) *(10) 
		}
//		num=4321;1234
//		4321    4   		1 			rec(432)*10 + 1
//		432		43			12			(rec(43)*10 +2)*10 + 1
//		43		432			123			((rec(4)*10+3)*10 +2)*10 + 1
//		4		4321		1234		(((4*10+1)*10+3)*10 +2)*10 + 1
//		reverseInt(43/10)*10+3 = reverseInt(4)*10+3 = (reverseInt(0)*10+4)*10+3 = 40+3 = 43
//	    
//		reverseInt(43 % 10)*10+4 = reverseInt(3)*10+4 = (reverseInt(0)*10+3)*10+4 = 30+4 = 34
//		reverseint(4)+3*10
//		0+4*10+30
/*		num== return 0
		num%10 + 10 * (num/10)
		
		3 + 10 * (4 + 10 * 0)
		
		3+ 10 * ( 12)
		3+ 10 * (2 + 10 * (1 + 10 * 0))
*/}
