package com.multi.thread.practice;

public class ThreadDemo {

	public static void main(String[] args) {
		
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		obj1.start();
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		obj2.start();
		//try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		
		Runnable obj3 = new Heyy();
		Runnable obj4 = new Hmm();
		
		Thread t1 = new Thread(obj3);
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		Thread t2 = new Thread(obj4);
		
		t1.start();
		t2.start();
		
		
	}

	

}
