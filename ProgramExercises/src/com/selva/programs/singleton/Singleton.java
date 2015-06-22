package com.selva.programs.singleton;

public class Singleton{

	private Singleton(){
		
		init();
	}
	
	private static void init(){
		System.out.println(" initialized ");
	}
	
	public static Singleton getInstance(){
		return Holder.instance;
	}
	
	private static class Holder{
		
		public static final Singleton instance = new Singleton();
		
	}
	
}
