package com.selva.programs.thread;

import java.util.LinkedList;
import java.util.Queue;

public class InterThreadCommunicationExample {

    public static void main(String args[]) {

        final Queue<Integer> sharedQ = new LinkedList<Integer>();

        Thread producer = new Producer(sharedQ);
        Thread consumer = new Consumer(sharedQ);

        producer.start();
//        consumer.start();

    }
}




//ead more: http://javarevisited.blogspot.com/2013/12/inter-thread-communication-in-java-wait-notify-example.html#ixzz3crwjwVEz
