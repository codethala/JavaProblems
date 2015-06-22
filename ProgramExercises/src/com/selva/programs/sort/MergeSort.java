package com.selva.programs.sort;

import java.util.Arrays;

public class MergeSort {
    
    private int[] array;
    private int[] tempMergArr;
    private int length;
    private int ctr =0;
 
    public static void main(String a[]){
         
        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
//        int[] inputArr = {38,27,43,3,9,82,10};
        MergeSort mms = new MergeSort();
        System.out.println(Arrays.toString(inputArr));
        mms.sort(inputArr);
        System.out.println(Arrays.toString(inputArr));
    }
     
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
//        doMergeSort(0, length - 1,ctr);
        doMergeSort(0, length - 1);
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
        
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }

	
    private void doMergeSort(int lowerIndex, int higherIndex, int ctr) {
        ctr++; 
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            System.out.println(ctr +" : doMergeSort : lowerIndex: " + array[lowerIndex] + " middle : " + array[middle] );
            doMergeSort(lowerIndex, middle, ctr);            
            // Below step sorts the right side of the array
            System.out.println(ctr +" : doMergeSort : middle + 1: " + array[middle + 1] + " higherIndex : " + array[higherIndex] );
            doMergeSort(middle + 1, higherIndex, ctr);            
            // Now merge both sides
            System.out.println(ctr +" : mergeParts : lowerIndex: " + array[lowerIndex] + " middle: " + array[middle] + " higherIndex : " + array[higherIndex] );
            mergeParts(lowerIndex, middle, higherIndex, ctr);            
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex, int ctr) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        System.out.println(ctr +" : Temp Array : " +Arrays.toString(tempMergArr));
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }
}
//- See more at: http://www.java2novice.com/java-sorting-algorithms/merge-sort/#sthash.Qv67cpmr.dpuf