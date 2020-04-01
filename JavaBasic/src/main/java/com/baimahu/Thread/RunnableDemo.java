package com.baimahu.Thread;

public class RunnableDemo {
    public static void main(String[] args) throws Exception{
        HiRun hiRun = new HiRun();
        HelloRun helloRun = new HelloRun();

        Thread threadHi = new Thread(hiRun);
        Thread threadHello = new Thread(helloRun);

        threadHi.start();
        // sleep 10 millis so two thread will not conflict
        Thread.sleep(10);
        threadHello.start();
    }
}

class HiRun implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("hi");
            try { Thread.sleep(1000); } catch (Exception e) {e.printStackTrace();}
        }
    }
}

class HelloRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("hello");
            try { Thread.sleep(1000); } catch (Exception e) {e.printStackTrace();}

        }
    }
}