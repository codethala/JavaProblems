package com.selva.programs.threads;

import java.util.LinkedList;
import java.util.Queue;

public class Consumer extends Thread{
	Queue sharedQ = null;
	public Consumer(Queue sharedQ){
		super("Consumer");
		this.sharedQ = sharedQ;
		
	}

public void run(){
		
		synchronized (sharedQ) {
			for(int i = 0; i<=4 ; i++){
			
				while(sharedQ.size() == 0 ){
					
					try {
						sharedQ.wait();
					} catch (InterruptedException e) {
					
						e.printStackTrace();
					}
				}
				System.out.println("Consuming : " + i);
				sharedQ.remove();
				sharedQ.notify();
				
			}	
		}
	}
}

