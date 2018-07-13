package com.zhangyuyang.concurrency.chapter4;

/**
 * 后台线程 -- >  自己模拟后台线程
 */
public class DaemonThread2 {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
           Thread innerThread = new Thread(()->{
                while(true){
                    try {
                        System.out.println("do some things for health check..");
                        Thread.sleep(1_000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
           });
           innerThread.setDaemon(true);
           innerThread.start();

            try {
                Thread.sleep(1_000L);
                System.out.println("T thread is finished done");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();
    }
}
