package com.selva.programs.thread;

import java.util.concurrent.BlockingQueue;

public class ProducerBQ extends Thread{
	
	BlockingQueue<Integer> sharedQ = null;
	
	public ProducerBQ(BlockingQueue<Integer> q){
		sharedQ = q;
	}
	
	public void run(){
		
//		synchronized (sharedQ) {
			try {
				System.out.println(sharedQ.take());
				Thread.sleep(20);
				System.out.println(sharedQ.take());
				Thread.sleep(20);
				System.out.println(sharedQ.take());
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		}
		
	}
	

}
