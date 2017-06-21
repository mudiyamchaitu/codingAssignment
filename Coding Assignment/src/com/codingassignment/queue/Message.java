package com.codingassignment.queue;


public class Message {
    private int no;
    private boolean isPrime;
    
    public Message(int no, boolean isPrime){
        this.no = no;
        this.isPrime = isPrime;
    }

    public String toString() {
    	return "number:" + no + " isPrime:" + isPrime;
    }
    public Message getMsg() {
        return this;
    }

}
