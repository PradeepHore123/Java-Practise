package com.tcs.treads;

public class Worker implements Runnable {
	public  void run() {
		System.out.println(Thread.currentThread());
	}
}
