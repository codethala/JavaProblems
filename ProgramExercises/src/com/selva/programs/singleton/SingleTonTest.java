package com.selva.programs.singleton;

public class SingleTonTest {
	
	public static void main(String[] args) {
		
		System.out.println("before initialization");
		
		Singleton singleton = Singleton.getInstance();
		
		MyThread[] threads  = new MyThread[100];
		
		for(int i = 0 ; i < threads.length ; i++){
			
			threads[i] = new MyThread(" Thread - "+ i);
			threads[i].start();
		}
		
	}
}
