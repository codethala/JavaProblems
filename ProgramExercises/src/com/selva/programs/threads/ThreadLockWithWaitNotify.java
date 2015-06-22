package com.selva.programs.threads;

public class ThreadLockWithWaitNotify {
	class Pen{}
	class Paper{}
	
	public static void main(String[] args) {
		ThreadLockWithWaitNotify x = new ThreadLockWithWaitNotify();
		final Pen pen = x.new Pen();
		final Paper paper = x.new Paper();
		Thread t1 = new Thread("Thread T1"){
			
			public void run() {
//				try{
				System.out.println(Thread.currentThread().getName());
				synchronized(pen){
						System.out.println(Thread.currentThread().getName() +" is holding Pen" );
						pen.notify();
					synchronized (paper) {						
						System.out.println(Thread.currentThread().getName() +" is holding Paper" );
						paper.notify();
					}
				}
//				}catch(InterruptedException e){
//					e.printStackTrace();	
//				}
			}
		};
		t1.start();
		
		Thread t2 = new Thread("Thread T2"){
			
			public void run(){
//				try{
				System.out.println(Thread.currentThread().getName());
				synchronized(paper){
					System.out.println(Thread.currentThread().getName() +" is holding Paper" );
					paper.notify();
					synchronized (pen) {
						System.out.println(Thread.currentThread().getName() +" is holding Pen" );
						pen.notify();
					}
				}
//				}catch(InterruptedException e){
//					e.printStackTrace();
//				}
			}
		};
		t2.start();
	}
}


