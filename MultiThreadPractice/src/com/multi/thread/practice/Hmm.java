package com.multi.thread.practice;

public class Hmm implements Runnable {
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("hmm");
			try {Thread.sleep(50);} catch (InterruptedException e) {}
		}
	}

}
