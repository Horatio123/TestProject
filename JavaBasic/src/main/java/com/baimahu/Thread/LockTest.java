package com.baimahu.Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

    public static void main(String[] args) throws InterruptedException {
        LockObj lockObj = new LockObj();
        Thread t1 = new Thread(lockObj::remove);
        t1.start();
        Thread t3 = new Thread(lockObj::remove);
        t3.start();

        Thread.sleep(5_000);
        Thread t2 = new Thread(lockObj::give);
        t2.start();
        LockTest lockTest = new LockTest();
        Thread thread4 = new Thread(lockTest::accessResource);
        Thread thread5 = new Thread(lockTest::accessResource);
        thread4.start();
        thread5.start();

        Thread thread6 = new Thread(LockTest::accessResourceLock);
        Thread thread7 = new Thread(LockTest::accessResourceLock);
        thread6.start();
        thread7.start();

    }

    private void accessResource() {
        synchronized (this) {
            System.out.println("synchronized test");
            try {
                Thread.sleep(3_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    private static ReentrantLock lock = new ReentrantLock();
    private static void accessResourceLock() {
        lock.lock();
        System.out.println("lock test");
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        lock.unlock();
    }


}

class LockObj {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void remove() {
        lock.lock();
        try {
            System.out.println("remove method, wait");
            condition.await();
            System.out.println("remove wait complete");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void give() {
        lock.lock();
        try {
            System.out.println("give method");
            condition.signalAll();
            System.out.println("give continue");
        } finally {
            lock.unlock();
        }
    }
}
class runRemove implements Runnable {
    LockObj lockObj = new LockObj();
    @Override
    public void run() {
        lockObj.remove();
    }
}
class runGive implements Runnable {
    LockObj lockObj = new LockObj();
    @Override
    public void run() {
        lockObj.give();
    }
}
