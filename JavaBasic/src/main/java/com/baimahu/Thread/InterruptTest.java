package com.baimahu.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class InterruptTest {

    public static void main(String[] args) {

        FutureTask<Integer> result = new FutureTask<>(new SleepTask());

        Thread thread = new Thread(result);
        thread.start();

        try {
            Thread.sleep(9_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
        System.out.println("ask to interrupt thread");

    }
}
class SleepTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 100; i++) {

            System.out.println("SleepTask: " + i);
            Thread.sleep(1_000);
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("task is stopped");
                throw new InterruptedException();
            }
        }

        return null;
    }
}
