package com.selva.programs.thread.test3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class ProdConTest {
	public static void main(String[] args) {
		
	
		Queue<Integer> q = new LinkedList();
	
		Producer producer = new Producer(q, 4);
		Consumer consumer = new Consumer(q, 4);
		producer.start();
		consumer.start();
		
	}
}
