package com.multi.thread.practice;

public class Hello extends Thread {

	public void run() {
		for(int i=1;i<6;i++) {
			System.out.println("Hello");
			try {Thread.sleep(1050);} catch (InterruptedException e) {}
		}
	}
	
}
