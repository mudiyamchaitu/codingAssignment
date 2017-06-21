package com.codingassignment.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PrimeNumberVerification implements Runnable{


    BlockingQueue<Message> prime = new ArrayBlockingQueue<>(10);
    BlockingQueue<Integer> randomInteger = new ArrayBlockingQueue<>(10);

	public PrimeNumberVerification(BlockingQueue<Integer> randomInteger,
			BlockingQueue<Message> prime) {
		this.prime = prime;
		this.randomInteger = randomInteger;		
	}

	//checks whether an int is prime or not.
	boolean isPrime(int n) {
		//check if n is a multiple of 2
		if (n%2==0) return false;
		//if not, then just check the odds
		for(int i=3;i*i<=n;i+=2) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	@Override
	public void run() {
		for (int i = 0; i < 100 ; i++) {
			try {
				Integer randomInt = randomInteger.take();
				prime.add(new Message(randomInt, isPrime(randomInt)));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
