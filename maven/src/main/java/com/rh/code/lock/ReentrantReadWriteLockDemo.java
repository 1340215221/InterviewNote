package com.rh.code.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁
 */
public class ReentrantReadWriteLockDemo {

    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = lock.readLock();
        ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();
        new Thread(() -> {
            readLock.lock();
            // 读操作
            readLock.unlock();
        }).start();
        new Thread(() -> {
            writeLock.lock();
            // 写操作
            writeLock.unlock();
        }).start();
    }
}
