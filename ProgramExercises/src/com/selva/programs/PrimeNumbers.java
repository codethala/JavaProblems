package com.selva.programs;

import java.util.Scanner;

public class PrimeNumbers{

    public static void main (String[] args){
    
        Scanner scanner = new Scanner(System.in);
        int lengthOfSeries = scanner.nextInt();
        
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.generatePrimeNos(lengthOfSeries);
        scanner.close();
    }


    private void generatePrimeNos(int length){
        int count = 0;
        for(int i=1; i<= length; i++){
            count = 0;
            for(int j=1; j <=i;j++){            
                if( i % j == 0 ){
                    count ++;
                }
            }
            if(count <= 2){
                System.out.print(i + " ");
            }
        
        }
    
    }



}
