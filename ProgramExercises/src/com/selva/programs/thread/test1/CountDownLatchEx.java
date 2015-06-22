package com.selva.programs.thread.test1;

public class CountDownLatchEx {

	public static void main(String[] args) {
	CountDownLatchEx ex = new CountDownLatchEx();
	MyThread[] threads = new MyThread[4];
		for(int i = 0 ; i < 4 ; i++){
			
			threads[i]= ex.new MyThread("Thread " + i);
			threads[i].start();

		}
		for(int i = 0 ; i < 4 ; i++){
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	class MyThread extends Thread{
		
		public MyThread(String Threadname){
			super(Threadname);
		}
		
		public void run(){
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Completed "+ Thread.currentThread().getName());
		}
	}
	
}
