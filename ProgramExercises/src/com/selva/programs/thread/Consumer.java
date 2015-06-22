package com.selva.programs.thread;

import java.util.Queue;
import java.util.logging.Logger;

public class Consumer extends Thread {
//    private static final Logger logger = Logger.getAnonymousLogger(Consumer.class);
    private final Queue<Integer> sharedQ;

    public Consumer(Queue<Integer> sharedQ) {
        super("Consumer");
        this.sharedQ = sharedQ;
    }

    @Override
    public void run() {
        while(true) {

            synchronized (sharedQ) {
                //waiting condition - wait until Queue is not empty
                while (sharedQ.size() == 0) {
                    try {
                        System.out.println("Queue is empty, waiting");
                        sharedQ.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                int number = sharedQ.poll();
                System.out.println("consuming : " + number );
                sharedQ.notify();
              
                //termination condition
                if(number == 3){break; }
            }
        }
    }
}


//Read more: http://javarevisited.blogspot.com/2013/12/inter-thread-communication-in-java-wait-notify-example.html#ixzz3crx4oJCy