package com.rh.code.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 重入锁
 */
public class ReentrantLockDemo {

    public static void main(String[] args) throws Exception {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        new Thread(() -> {
            lock.lock();
            try {
                System.out.println("thread 1 wait"); // 1)
                condition.await();
                System.out.println("thread 1 notify"); // 3)
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            lock.unlock();
        }).start();
        Thread.sleep(3000);
        new Thread(() -> {
            lock.lock();
            System.out.println("thread 1 signal"); // 2)
            condition.signal();
            lock.unlock();
        }).start();
    }
}
