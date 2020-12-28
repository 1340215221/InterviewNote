package com.rh.code.lock;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 悲观锁
 */
public class PessimisticLock {

    /**
     * 重入锁例子
     */
    public void simpleExample() {
        Lock lock = new ReentrantLock();
        lock.lock();
        // 业务代码
        lock.unlock();
    }

    /**
     * CountDownLatch
     */
    public void simpleExample2() throws InterruptedException {
        CountDownLatch cdl = new CountDownLatch(1);
        cdl.countDown();// 相当于唤醒
        // 业务代码
        cdl.await();// 相当于等待
    }

}
