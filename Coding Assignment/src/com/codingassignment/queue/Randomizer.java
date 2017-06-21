package com.codingassignment.queue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Randomizer implements Runnable{

	Random rand = new Random();
	
    BlockingQueue<Message> prime = new ArrayBlockingQueue<>(10);
    BlockingQueue<Integer> randomInteger = new ArrayBlockingQueue<>(10);

	public Randomizer(BlockingQueue<Integer> randomInteger,
			BlockingQueue<Message> prime) {
		this.prime = prime;
		this.randomInteger = randomInteger;
	}

	@Override
	public void run() {

		for (int i = 0; i < 10 ; i++) {

			int  n = rand.nextInt(500) + 1;
			randomInteger.add(n);
			//500 is the maximum and the 1 is our minimum 


			try{
				Thread.sleep(1500);

				//consuming messages until exit message is received
				Message msg = prime.take();
				System.out.println(msg.getMsg());
			}catch(InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
