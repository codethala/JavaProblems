package com.selva.programs;

import java.util.Scanner;

// (3*3*3 + 7*7*7 + 1*1*1 = 371). 
public class ArmstrongNumber {
	
	public static void main (String[] args){
		
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(Math.pow(3,3));
		armstrongNumber.checkIfArmStrong(num);
		scanner.close();
	}
	
	
	private boolean checkIfArmStrong(int num){
		double resint = 0;
		String strNum = String.valueOf(num);
		while(num != 0){
			int reminder = num %10, reminderTotInt = 1;
			for(int i = 0 ; i< strNum.length(); i++){
				reminderTotInt = reminderTotInt * reminder;				
			}
//			resint = resint + Math.pow((num % 10),strNum.length());
			resint = resint + reminderTotInt ;
			num = num / 10;
		}
		System.out.println(" Result " + resint);
		if(Double.parseDouble(num +"") == resint){
			System.out.println(" this is a armstrong number");
		}
		return false;
	}
	
	
	
	
	private boolean checkIfArmStrong2(int num){		
		boolean result = false;
		double armCheckInt = 0;
		String strNum = String.valueOf(num);
		int noOfDigits = strNum.length();
		for(int i =0; i<noOfDigits;i++){
			armCheckInt = armCheckInt + Math.pow((num % 10), noOfDigits);
			num = num / 10;
		}
		
		System.out.println(" Result Armstrong " + armCheckInt);
		if(armCheckInt == num){
			return true;
		}
		return result; 
	}

}
