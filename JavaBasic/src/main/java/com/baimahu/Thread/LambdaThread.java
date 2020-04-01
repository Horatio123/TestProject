package com.baimahu.Thread;

public class LambdaThread {
    public static void main(String[] args) throws Exception{

        Thread threadHi = new Thread( () -> {
            for (int i = 0; i < 6; i++) {
                System.out.println("hi " + Thread.currentThread().getPriority());
                try { Thread.sleep(1000); } catch (Exception e) {e.printStackTrace();}
            }
        });
        Thread threadHello = new Thread(() -> {
            for (int i = 0; i < 6; i++) {
                System.out.println("hello " + Thread.currentThread().getPriority());
                try { Thread.sleep(1000); } catch (Exception e) {e.printStackTrace();}
            }
        });

        threadHi.start();
        // sleep 10 millis so two thread will not conflict
        Thread.sleep(10);
        threadHello.start();

        System.out.println(threadHi.isAlive());
        threadHi.join();
        threadHello.join();
        System.out.println(threadHi.isAlive());
        System.out.println("Bye Bye");
    }
}

//    Runnable hiRun = new Runnable() {
//        @Override
//        public void run() {
//            for (int i = 0; i < 6; i++) {
//                System.out.println("hi");
//                try { Thread.sleep(1000); } catch (Exception e) {e.printStackTrace();}
//            }
//        }
//    };
//
//    Runnable helloRun = new Runnable() {
//        @Override
//        public void run() {
//            for (int i = 0; i < 6; i++) {
//                System.out.println("hello");
//                try { Thread.sleep(1000); } catch (Exception e) {e.printStackTrace();}
//
//            }
//        }
//    };


//    Runnable hiRun = () -> {
//        for (int i = 0; i < 6; i++) {
//            System.out.println("hi");
//            try { Thread.sleep(1000); } catch (Exception e) {e.printStackTrace();}
//        }
//    };
//
//    Runnable helloRun = () -> {
//        for (int i = 0; i < 6; i++) {
//            System.out.println("hello");
//            try { Thread.sleep(1000); } catch (Exception e) {e.printStackTrace();}
//        }
//    };
