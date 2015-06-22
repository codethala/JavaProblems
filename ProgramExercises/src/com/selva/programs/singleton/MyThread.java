package com.selva.programs.singleton;

import java.security.Signature;

public class MyThread extends Thread{

	public MyThread(String name){
		super(name);
	}
	@Override
	public void run() {
		
		Singleton singleton = Singleton.getInstance();
		System.out.println(Thread.currentThread().getName() + " " + singleton);
		super.run();
	}
}
