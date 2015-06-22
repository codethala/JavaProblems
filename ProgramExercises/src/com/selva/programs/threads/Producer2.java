package com.selva.programs.threads;


import java.util.concurrent.BlockingQueue;

public class Producer2 implements Runnable {
	private final BlockingQueue<Integer> sharedQ ;
	public Producer2(BlockingQueue<Integer> sharedQ){
		this.sharedQ = sharedQ;
	}
	
	@Override
	public void run(){
		
		for(int i =0 ; i< 4 ; i++){
			try {
				System.out.println("Producing : " + i) ;
				sharedQ.put(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

