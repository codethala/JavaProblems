package com.selva.programs.search.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
    static Integer[] x = {3, 4, 55, 67, 44, 3, 55, 56, 78, 44};
	public static void main(String[] args) {
		
		removeDuplicate();
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(removeDuplicate()));
		System.out.println(Arrays.toString(removeNonDuplicate()));

	}
	private static Integer[] removeDuplicate(){
		Set<Integer> newSet = new HashSet<Integer>();
		for(int i= 0;i<x.length;i++){
			newSet.add(x[i]);
		}
		return (Integer[]) newSet.toArray(new Integer[newSet.size()]);
	}
	
	private static Integer[] removeNonDuplicate(){		
		Set<Integer> newSet = new HashSet<Integer>();
		List<Integer> newList = new ArrayList<Integer>();
		List<Integer> duplicateList = new ArrayList<Integer>();
		Collections.addAll(newList, x);
		Collections.addAll(duplicateList, x);
		for(int i=0;i<x.length;i++){
			if(newSet.add(x[i])){
				duplicateList.remove(x[i]);
			}
		}
		for(int i=0;i<x.length;i++){
			if(!duplicateList.contains(x[i])){
				newList.remove(x[i]);
			}
				
		}
		return (Integer[]) newList.toArray(new Integer[newList.size()]);
	}
	
//	private static Integer[] removeNonDuplicates(){
//		
//		for(int i =0;i<x.length;i++){
//				
//			
//		}
//	}

}
