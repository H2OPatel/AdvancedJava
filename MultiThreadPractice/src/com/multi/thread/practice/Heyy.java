package com.multi.thread.practice;

public class Heyy implements Runnable {

	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("heyy");
			try {Thread.sleep(50);} catch (InterruptedException e) {}
		}
	}
	
	
}
