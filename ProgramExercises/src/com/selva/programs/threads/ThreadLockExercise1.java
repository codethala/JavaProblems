package com.selva.programs.threads;

public class ThreadLockExercise1 {

  static Object lock1 = new Object();
  static Object lock2 = new Object();

	public static void main(String[] args) {
		
		Thread t1 = new Thread("Thread 1"){
			
			public void run(){
				
				synchronized (lock1) {
					System.out.println(Thread.currentThread().getName() + " holding Lock1");
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					synchronized (lock2) {
						System.out.println(Thread.currentThread().getName() + " holding Lock2");	
					}
				}
			}
			
		};
	Thread t2 = new Thread("Thread 2"){
			
			public void run(){
				
				synchronized (lock1) {
					System.out.println(Thread.currentThread().getName() + " holding Lock2");
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					synchronized (lock2) {
						System.out.println(Thread.currentThread().getName() + " holding Lock1");	
					}
				}
			}
			
		};
		
		t1.start();t2.start();
	}
}

