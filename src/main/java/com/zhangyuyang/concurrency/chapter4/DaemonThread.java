package com.zhangyuyang.concurrency.chapter4;

/**
 * 线程API --> 后台线程
 * 当前线程结束,后台线程也会结束
 * Thread A  connect Thread B
 * health check
 * A<---------------------------------->B
 *  ->daemonThread(health check)
 */
public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName()+" is running");
                    Thread.sleep(100_000L);
                    System.out.println(Thread.currentThread().getName()+" is done");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        // if thread is running , it will throw IllegalThreadStateException
        t.setDaemon(true);
        //runnable  ->running| ->dead| ->blocked
        t.start();
        Thread.sleep(5_000);   //JDK1.7
        System.out.println(Thread.currentThread().getName());
    }
}
