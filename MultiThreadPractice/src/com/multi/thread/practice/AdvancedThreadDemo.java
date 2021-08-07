package com.multi.thread.practice;

public class AdvancedThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Thread tr1 = new Thread(() ->
		{
			for(int i=1;i<=5;i++) {
				System.out.println("This is Thread Test 1");
				try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			}
		}
		);
		
		Thread tr2 = new Thread(() ->
		{
			for(int i=1;i<=5;i++) {
				System.out.println("This is Thread Test 2");
				try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			}
		}
		);
		
		tr1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
		tr2.start();
		
		tr1.join();
		tr2.join();
		
		System.out.println("bye");
		
	}

}
