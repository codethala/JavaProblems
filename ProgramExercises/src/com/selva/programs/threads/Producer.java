package com.selva.programs.threads;

import java.util.Queue;

public class Producer extends Thread {

	Queue sharedQ = null;
	
	public Producer(Queue sharedQ){
		super("Producer");
		this.sharedQ = sharedQ;
	}
	
	@Override
	public void run(){
		
		synchronized (sharedQ) {
			for(int i = 0; i<=4 ; i++){
			
				while(sharedQ.size() >= 1){
					
					try {
						sharedQ.wait();
					} catch (InterruptedException e) {
					
						e.printStackTrace();
					}
				}
				System.out.println("Producing : " + i);
				sharedQ.add(1);
				sharedQ.notify();
				
			}	
		}
		
		
	}
}

