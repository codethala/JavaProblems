package com.selva.programs.threads;

import java.util.LinkedList;
import java.util.Queue;

public class ProdConsumeTest {
	
	public static void main(String[] args) {
		final Queue sharedQ = new LinkedList<>();
		

		Producer producer = new Producer(sharedQ);
		Consumer consumer = new Consumer(sharedQ);
		
		producer.start();
		consumer.start();
	
	}
		
	
}

