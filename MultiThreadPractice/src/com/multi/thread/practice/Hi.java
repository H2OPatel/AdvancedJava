package com.multi.thread.practice;

 public class Hi extends Thread {
	
	public void run() {
		
		for(int i=1;i<6;i++) {
			System.out.println("Hi");
			try {Thread.sleep(1050);} catch (InterruptedException e) {}
		}
	}

}
