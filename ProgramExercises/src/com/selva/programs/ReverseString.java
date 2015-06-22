package com.selva.programs;

import java.util.Scanner;

public  class ReverseString{

    public static void main(String[] args){
        ReverseString reverseString = new ReverseString();
        Scanner scanner = new Scanner(System.in);
        String strInput = scanner.next();
        reverseString .doWork(strInput);
    }

    private void doWork(String strInput){
        String reversedStr = new String();
        for(int len = strInput.length(), i = len -1 ; i >= 0 ; i--){
        
            reversedStr = reversedStr + strInput.charAt(i);
            
        }
        System.out.print(reversedStr );
    }


}
