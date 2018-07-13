package com.zhangyuyang.concurrency.chapter3;

/**
 * 创建线程 -- stackSize
 */
public class CreateThreadAboutStackSize {
    private int i =0;

    private byte[] bytes = new byte[1024];

    private static int counter =0;

    // JVM will create a thread named "main"
    public static void main(String[] args) {
        try{
            // create a JVM stack
            add(0);
        }catch (Error e){
            e.printStackTrace();
            // StackOverflowError 的错误
            // 22554
            System.out.println(counter);
        }
    }

    private static void add(int i){
        ++counter;
        add(i+1);
    }


}
