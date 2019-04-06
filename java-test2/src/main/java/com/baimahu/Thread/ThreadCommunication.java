package com.baimahu.Thread;


public class ThreadCommunication {
    public static void main(String[] args) {
        P p = new P();
        Producer producer = new Producer(p);
        Customer customer = new Customer(p);
    }
}

class P {
    int num;
    boolean valueSet = false;
    public synchronized void put(int n) {
        while (valueSet) {
            try {wait();} catch (Exception e) {e.printStackTrace();}
        }
        this.num = n;
        valueSet = true;
        System.out.println(Thread.currentThread().getName() + " put: " + num);
        notify();
    }
    public synchronized void get() {
        while (!valueSet) {
            try {wait();} catch (Exception e) {e.printStackTrace();}
        }
        valueSet = false;
        System.out.println(Thread.currentThread().getName() + " get: " + num);
        System.out.println();
        notify();
    }
}

class Producer implements Runnable {
    P p;

    public Producer(P p) {
        this.p = p;
        Thread t = new Thread(this, "Producer");
        t.start();
    }
    @Override
    public void run() {
        int i = 0;
        while (true) {
            p.put(i++);
            try {Thread.sleep(200);} catch (Exception e) {e.printStackTrace(); }
        }
    }
}

class Customer implements Runnable {
    P p;

    public Customer(P p) {
        this.p = p;
        Thread t = new Thread(this, "Customer");
        t.start();
    }
    @Override
    public void run() {
        while (true) {
            p.get();
            try {Thread.sleep(1000);} catch (Exception e) {e.printStackTrace(); }
        }
    }
}