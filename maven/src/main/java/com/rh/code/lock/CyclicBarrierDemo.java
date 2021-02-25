package com.rh.code.lock;

import java.util.concurrent.CyclicBarrier;

/**
 * 栅栏
 */
public class CyclicBarrierDemo {

    public static void main(String[] args) throws Exception {
        CyclicBarrier barrier = new CyclicBarrier(2);
        new Thread(() -> {
            try {
                System.out.println("thread 1 wait"); // 1)
                barrier.await();
                System.out.println("thread 1 notify"); // 3)
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).start();
        Thread.sleep(3000);
        new Thread(() -> {
            try {
                System.out.println("thread 2 wait"); // 2)
                barrier.await();
                System.out.println("thread 2 notify"); // 3)
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}
