package com.baimahu.Thread;

public class SynchronizedThread {
    public static void main(String[] args) throws Exception{
        Counter counter = new Counter();

        Thread thread = new Thread( () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increase();
            }
        }
        );

        Thread thread2 = new Thread( () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increase();
            }
        }
        );

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();
        System.out.println(counter.count);
    }
}

class Counter {
    int count;

    public synchronized void increase() {
        count ++;
    }
}