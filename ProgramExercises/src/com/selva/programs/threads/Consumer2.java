package com.selva.programs.threads;



import java.util.concurrent.BlockingQueue;

public class Consumer2 implements Runnable{
	private final BlockingQueue<Integer> sharedQ ;

	public Consumer2(BlockingQueue<Integer> sharedQ){
		this.sharedQ = sharedQ;		
	}
	@Override
	public void run(){
		while(true){
			try {
				System.out.println(" Consuming :  " + sharedQ.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

