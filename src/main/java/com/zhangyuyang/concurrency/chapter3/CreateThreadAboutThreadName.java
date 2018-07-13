package com.zhangyuyang.concurrency.chapter3;

/**
 * 创建线程的方式
 */
public class CreateThreadAboutThreadName {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread() {
            @Override
            public void run() {
                System.out.println("==========");
            }
        };
        t1.start();
        t2.start();

        // init(null, null, "Thread-" + nextThreadNum(), 0);
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        Thread t3 = new Thread("MyName");
        Thread t4 = new Thread(
                ()-> System.out.println("Runnable lambda... ")
        );
        t3.start();
        t4.start();
        System.out.println(t3.getName());
        System.out.println(t4.getName());

        Thread t5 = new Thread(() -> {
            System.out.println("Runnable..." + Thread.currentThread().getName());
        },"RunnableThread");

        t5.start();
    }
}
