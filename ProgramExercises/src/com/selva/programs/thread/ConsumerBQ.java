package com.selva.programs.thread;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class ConsumerBQ extends Thread{
	
	BlockingQueue<Integer> sharedQ = null;
	
	public ConsumerBQ(BlockingQueue<Integer> q){
		sharedQ = q;
	}
	
	public void run(){
		
//		synchronized (sharedQ) {
			try {
				System.out.println("Producing " + 1);
				sharedQ.put(1);
				Thread.sleep(20);
				System.out.println("Producing " + 2);
				sharedQ.put(2);
				Thread.sleep(20);
				System.out.println("Producing " + 3);
				sharedQ.put(3);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		}
		
	}
	

}
