package com.rh.code.lock.synchronize;

/**
 * 使用Synchronized被同一把锁的加锁的代码块, 都需要等待抢占到该锁才能执行
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
