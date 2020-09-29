package com.rh.code.lock;

/**
 * synchronized锁
 */
public class SynchronizedLock {

    public static void main(String[] args) {
        SynchronizedLock demo = new SynchronizedLock();
        demo.synch2();
    }

    public synchronized void synch2() {
        System.out.println("synch2");
        this.synch1();
    }

    public synchronized void synch1() {
        System.out.println("synch1");
    }

    public void syncBeanLock() {
        synchronized (this) {
            //代码块
        }
    }

    public void syncClassLock() {
        synchronized (SynchronizedLock.class) {
            //代码块
        }
    }
}
