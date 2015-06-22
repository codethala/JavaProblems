package com.selva.programs.thread.test3;

import java.util.LinkedList;
import java.util.Queue;

public class Consumer extends Thread{
	Queue<Integer> sharedQ = new LinkedList<Integer>();
	int maxcount = 0;
	public Consumer(Queue<Integer> q, int count ){
		sharedQ = q;
		maxcount = count;
	}
	public void run(){
		
		for(int i=0;i<maxcount; i++){
			
			synchronized (sharedQ) {
				if(sharedQ.size() == 0){
					try {						
						sharedQ.wait();	
						System.out.println("Waiting for producer....");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				sharedQ.poll();
				sharedQ.notify();
				
				
			}
		}
	}

}
