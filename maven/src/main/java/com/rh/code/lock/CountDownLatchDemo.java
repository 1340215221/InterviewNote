package com.rh.code.lock;

import java.util.concurrent.CountDownLatch;

/**
 * 计数器
 */
public class CountDownLatchDemo {

    public static void main(String[] args) throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(() -> {
            try {
                System.out.println("thread 1 wait"); // 1)
                countDownLatch.await();
                System.out.println("thread 1 notify"); // 3)
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).start();
        Thread.sleep(3000);
        new Thread(() -> {
            System.out.println("thread 2 计数+1"); // 2)
            countDownLatch.countDown();
        }).start();
    }
}
