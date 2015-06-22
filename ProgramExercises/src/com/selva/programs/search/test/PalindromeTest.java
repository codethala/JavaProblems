package com.selva.programs.search.test;

public class PalindromeTest {
	static String str = "ASDrdsa";
	public static void main(String[] args) {
		palindrome();
	}

	private static void palindrome(){
		int len = str.length();
		StringBuilder revStr = new StringBuilder();
		while(len>0){
			len--;
			revStr = revStr.append(str.charAt(len));
		}
		
		if(str.equalsIgnoreCase(revStr.toString())){
			System.out.println("Its Palindrome");
		}else{
			System.out.println("Its not Palindrome");
		}
	}
}
