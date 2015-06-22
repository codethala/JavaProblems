package com.selva.programs.thread;

import java.util.Queue;

public class Producer extends Thread {
//    private static final Logger logger = Logger.getLogger(Producer.class);
    private final Queue<Integer> sharedQ;

    public Producer(Queue<Integer> sharedQ) {
        super("Producer");
        this.sharedQ = sharedQ;
    }

    @Override
    public void run() {

        for (int i = 0; i < 4; i++) {

            synchronized (sharedQ) {
                //waiting condition - wait until Queue is not empty
                while (sharedQ.size() >= 1) {
                    try {
                        System.out.println("Queue is full, waiting");
                        sharedQ.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                System.out.println("producing : " + i);
                sharedQ.add(i);
                sharedQ.notify();
            }
        }
    }
}


//ead more: http://javarevisited.blogspot.com/2013/12/inter-thread-communication-in-java-wait-notify-example.html#ixzz3crwr3t5R