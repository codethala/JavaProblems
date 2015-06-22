package com.selva.programs.threads;

public class ThreadLockExercise {

  static Object lock1 = new Object();
  static Object lock2 = new Object();

	public static void main(String[] args) {
//		ThreadLockExercise exercise = new ThreadLockExercise();
		Thread t1 = new Thread("Thread T1"){
			
			public void run(){
				System.out.println(Thread.currentThread().getName());
				synchronized(lock1){
					System.out.println(Thread.currentThread().getName() +" is holding Pen" );
					try{
						Thread.sleep(10);
					}catch(Exception e){
						e.printStackTrace();
					}
					synchronized (lock2) {
						System.out.println(Thread.currentThread().getName() +" is holding Paper" );
					}
				}
			}
		};
	
		
		Thread t2 = new Thread("Thread T2"){
			
			public void run(){
				System.out.println(Thread.currentThread().getName());
				synchronized(lock1){
					System.out.println(Thread.currentThread().getName() +" is holding Paper" );
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					synchronized (lock2) {
						System.out.println(Thread.currentThread().getName() +" is holding Pen" );	
					}
					
				}
			}
		};
		t1.start();
		t2.start();
	}
}

