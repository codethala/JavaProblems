package com.selva.programs.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdConExample {

	public static void main(String[] args) {
		
	
	BlockingQueue<Integer> q = new ArrayBlockingQueue<>(10);
	
	ProducerBQ producerBQ = new ProducerBQ(q);
	ConsumerBQ consumerBQ = new ConsumerBQ(q);
	
	producerBQ.start();
	consumerBQ.start();
	}

}
