package com.zhangyuyang.concurrency.chapter4;

import java.util.Optional;

/**
 * 线程简单API
 */
public class ThreadSimpleAPI {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            try {
                Thread.sleep(1_000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t.start();
        Optional.of(t.getName()).ifPresent(System.out::println);  // 线程名称
        Optional.of(t.getId()).ifPresent(System.out::println);    // 线程id
        Optional.of(t.getPriority()).ifPresent(System.out::println); // 线程优先级
    }
}
