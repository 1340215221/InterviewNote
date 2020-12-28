package com.rh.code.lock.synchronize;

/**
 * 测试Synchronized加锁方式, 执行顺序
 */
public class SynMethodLockDemo {

    /**
     * 加锁的方法 1
     */
    public synchronized void run1() {
        System.out.println("run1");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
    }

    /**
     * 加锁方法 2
     */
    public synchronized void run2() {
        System.out.println("run2");
    }

    public static void main(String[] args) {
        SynMethodLockDemo demo = new SynMethodLockDemo();
        Thread threadA = new Thread(() -> {
            while (true) {
                demo.run1();
            }
        });
        Thread threadB = new Thread(() -> {
            while (true) {
                demo.run2();
            }
        });
        threadA.start();
        threadB.start();
    }
}
