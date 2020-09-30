package com.rh.code.lock.synchronize;

/**
 * synchronized锁
 */
public class SynBaseDemo {

    public static void main(String[] args) {
        SynBaseDemo demo = new SynBaseDemo();
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
        synchronized (SynBaseDemo.class) {
            //代码块
        }
    }
}
