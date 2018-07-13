package com.zhangyuyang.concurrency.chapter3;

import java.util.Arrays;

/**
 * 创建线程  -- ThreadGroup
 */
public class CreateThreadAboutThreadGroup {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(1_000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t.start();
        // System.out.println(t.getThreadGroup());   获得线程组
        // System.out.println(Thread.currentThread().getName());
        // If the security doesn't have a strong opinion of the matter
        //               use the parent thread group.
        //            if (g == null) {
        //                g = parent.getThreadGroup();
        //           }
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        // return an estimate of the number of active threads in this thread group
        System.out.println(threadGroup.activeCount());
        Thread[] threads = new Thread[threadGroup.activeCount()];
        // Copies into the specified array every active thread in the thread group
        threadGroup.enumerate(threads);
        Arrays.asList(threads).forEach(System.out::println);

    }
}
