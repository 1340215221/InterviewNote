package com.rh.code.lock.synchronize;

/**
 * synchronize实战
 */
public class SynchronizeAction {

    /**
     * 在lambda中使用synchronize
     * 错误写法
     */
    public void useSynInLambda_Error() throws Exception{
        Object lock = new Object();
        synchronized (lock) {
            new Thread(() -> {
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                }
                // 外面的 synchronized 并不能控制lambda块里面的代码为同步代码块
                // 在非同步代码块的地方调用wait()和notify()会抛异常IllegalMonitorStateException
                lock.notifyAll();
            }).start();
            lock.wait();
        }
    }

    /**
     * 在lambda中使用synchronize
     * 正确写法
     */
    public void useSynInLambda_Correct() throws Exception{
        Object lock = new Object();
        synchronized (lock) {
            new Thread(() -> {
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                }
                synchronized (lock) {
                    lock.notifyAll();
                }
            }).start();
            lock.wait();
        }
    }

}
