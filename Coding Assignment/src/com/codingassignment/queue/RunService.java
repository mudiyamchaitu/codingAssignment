package com.codingassignment.queue;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class RunService {
    public static void main(String[] args) {
        //Creating BlockingQueue of size 10
        BlockingQueue<Message> prime = new ArrayBlockingQueue<>(10);
        BlockingQueue<Integer> randomInteger = new ArrayBlockingQueue<>(10);

        Randomizer randomizer = new Randomizer(randomInteger, prime);
        PrimeNumberVerification primerVerification = new PrimeNumberVerification(randomInteger, prime);

        new Thread(randomizer).start();
        new Thread(primerVerification).start();

    }

}

