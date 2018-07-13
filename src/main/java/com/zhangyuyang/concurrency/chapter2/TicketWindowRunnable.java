package com.zhangyuyang.concurrency.chapter2;

/**
 * Runnable 的方式把逻辑代码和创建线程进行了分离
 */
public class TicketWindowRunnable implements  Runnable {
    private static final int MAX = 50;

    private  int index = 1;

    @Override
    public void run() {
        while (index <= MAX) {
            System.out.println(Thread.currentThread()+ ",当前的号码是:" + (index++));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
