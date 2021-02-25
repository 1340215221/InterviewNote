package com.rh.code.lock;

import java.util.concurrent.locks.StampedLock;

/**
 * jdk8新读写锁
 */
public class StampedLockDemo {

    public static void main(String[] args) throws Exception {
        StampedLock lock = new StampedLock();
        // 读锁
        new Thread(() -> {
            long stamp = lock.tryOptimisticRead();
            System.out.println(lock.validate(stamp)); // true
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println(lock.validate(stamp)); // false
        }).start();
        // 写锁
        new Thread(() -> {
            long stamp = lock.writeLock();
            // 写业务处理
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            lock.unlock(stamp);
        }).start();
    }
}
