package com.selva.programs.thread.test3;

import java.lang.reflect.Constructor;
import java.util.LinkedList;
import java.util.Queue;

public class Producer extends Thread{
	
	Queue<Integer> sharedQ = new LinkedList<Integer>();
	int maxcount = 0;
	public Producer(Queue<Integer> q, int count ){
		sharedQ = q;
		maxcount = count;
	}
	
	public void run (){
		
        for (int i = 0; i < maxcount; i++) {
			synchronized (sharedQ) {
				
				try {
					while(sharedQ.size() > 1){
						sharedQ.wait();
						System.out.println("Waiting for consumer... ");
					}
					System.out.println("Producing " + i );
					sharedQ.add(i);
					sharedQ.notify();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
