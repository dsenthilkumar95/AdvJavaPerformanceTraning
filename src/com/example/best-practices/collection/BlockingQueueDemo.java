package com.example.collection;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

//Communicate between threads using a Queue
class Producer implements Runnable {

	BlockingQueue<String> queue;

	Producer(BlockingQueue<String> q) {
		queue = q;
	}

	public void run() {
		try {
			while (true) {
				queue.put("" + (Math.random() * 1000));
				System.out.println("Put!!");
				TimeUnit.MILLISECONDS.sleep(700);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Consumer implements Runnable {

	private BlockingQueue<String> queue;

	Consumer(BlockingQueue<String> q) {
		queue = q;
	}

	public void run() {
		try {
			while (true) {
				String value = queue.take();
				System.out.println("GOT "+value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class BlockingQueueDemo {

	public static void main(String[] args) throws Exception {

		BlockingQueue<String> q = new LinkedBlockingQueue<String>(200);

		Thread p1 = new Thread(new Producer(q));
		Thread c1 = new Thread(new Consumer(q));

		p1.start();
		c1.start();
	}
}
