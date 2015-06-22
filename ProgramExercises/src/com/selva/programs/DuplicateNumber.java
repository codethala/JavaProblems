package com.selva.programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateNumber {
	
	public static void main(String[] args) {
		Integer[] intArr = new Integer[] {2,3,4,5,4,5,6,7,9,9};
		Set<Integer> intSet = new HashSet<>();
		Set<Integer> resturnSet = new HashSet<>();
		for(int i = 0; i< intArr.length ; i++){
			if(!intSet.add(intArr[i]) ){
				resturnSet.add(intArr[i]);
			}
			
		}
		Iterator<Integer> itr = resturnSet.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next());
		}
	}

}
