package com.multi.thread.practice;

class test1 implements Runnable {
	
	public void run() {
		
		for(int i=1;i<6;i++) {
			System.out.println("Test1");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}

}

class test2 implements Runnable {
	
	public void run() {
		
		for(int i=1;i<6;i++) {
			System.out.println("Test2");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}

}


public class ThreadLambdaDemo {
	
	
	Runnable obj3 = new test1();
	Runnable obj4 = new test2();
	
	Thread t3 = new Thread(obj3);
	Thread t4 = new Thread(obj4);
	

}
