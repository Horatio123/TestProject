package com.baimahu.Thread;

public class ThreadDemo {
    public static void main(String[] args) throws Exception{
        Hi hi = new Hi();
        Hello hello = new Hello();
        hi.start();
        // sleep 10 millis so two thread will not conflict
        Thread.sleep(10);
        hello.start();
    }
}

class Hi extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("hi");
            try { Thread.sleep(1000); } catch (Exception e) {e.printStackTrace();}
        }
    }
}

class Hello extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("hello");
            try { Thread.sleep(1000); } catch (Exception e) {e.printStackTrace();}

        }
    }
}