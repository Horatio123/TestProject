package com.baimahu.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(3);
        service.schedule(new ScheduledTask(), 3, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(new ScheduledTask(), 4, 5, TimeUnit.SECONDS);
        service.scheduleWithFixedDelay(new ScheduledTask(), 4, 5, TimeUnit.SECONDS);
    }
}
class ScheduledTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

    }
}