package com.rh.code.lock;

import java.util.concurrent.Semaphore;

/**
 * 信号量
 */
public class SemaphoreDemo {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        new Thread(() -> {
            try {
                semaphore.acquire();
                // 业务处理
                System.out.println("thread 1 start"); // 1)
                Thread.sleep(3000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("thread 1 end"); // 2)
            semaphore.release();
        }).start();
        new Thread(() -> {
            try {
                semaphore.acquire();
                System.out.println("thread 2 start"); // 3)
                // 业务处理
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            semaphore.release();
        }).start();
    }
}
