package com.selva.programs;


import java.util.Scanner;

public class FiboProgram{

 public static void main(String[] args){
 
	 FiboProgram fiboSeries = new FiboProgram();
     
     Scanner scanner = new Scanner(System.in);
     int lengthOfSeries = scanner.nextInt();
     
     for(int i =0 ; i < lengthOfSeries; i++){
         System.out.print(fiboSeries.fibo(i) + " " );
     }
     scanner.close();
 }
 
  private int fibo(int i){
  
     if(i == 0)
         return 0;
     else if( i== 1)
         return 1;
     return  fibo(i-2) + fibo(i-1);
  
  }





}