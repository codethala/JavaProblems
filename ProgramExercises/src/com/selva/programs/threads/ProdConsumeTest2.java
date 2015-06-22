package com.selva.programs.threads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProdConsumeTest2 {
	
	public static void main(String[] args) {
		final BlockingQueue<Integer> sharedQ = new LinkedBlockingQueue<Integer>();
		
		

		Thread producer = new Thread(new Producer2(sharedQ));
		Thread consumer = new Thread (new Consumer2(sharedQ));
		
		producer.start();
		consumer.start();
	
	}
		
	
}

