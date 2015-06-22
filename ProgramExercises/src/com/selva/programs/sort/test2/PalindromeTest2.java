package com.selva.programs.sort.test2;

public class PalindromeTest2 {
	static String str = "asdfedsa";
	static int num = 123454321;
	public static void main(String[] args) {
		
		reverseStr();
		System.out.println(reverseStr());
//		System.out.println(reverseNum() + "");
	}
//	1234
	private static int reverseNum(){
		int revnum = 0, rem;
		while( num > 0){ // 1 % 10 = 0
			rem = num % 10;
			revnum = (revnum * 10)+ rem;;
			num = num / 10;
		}
		return revnum;
		
	}
	private static String reverseStr1(){
		StringBuilder revStr = new StringBuilder();
		for(int i = str.length() -1; i>=0 ; i--){
			revStr.append(str.charAt(i));			
		}
		return revStr.toString();
	}
	private static boolean reverseStr(){
		
		int mid = str.length() / 2; // 7  = 3 ; 6 = 3
		int len = str.length();
		for(int i = 0 ; i< mid ; i++){
			System.out.println(" i : " + i + " mid : " + mid);
			if(str.charAt(i) != str.charAt(len - (i +1))){
				return false;
			}						
		}
		return true;
	}
}
