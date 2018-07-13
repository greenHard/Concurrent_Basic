package com.zhangyuyang.concurrency.chapter3;

/**
 * 创建线程 -- stackSize2
 */
public class CreateThreadAboutStackSize2 {
    private static int counter = 0;
    public static void main(String[] args) {
        // 指定  JVM stack 大小
        Thread t = new Thread(null, new Runnable(){
            @Override
            public void run() {
                try {
                    add(1);
                }catch (Error e){
                    System.out.println(counter);
                }
            }
            private void add(int i){
                counter++;
                add(i+1);
            }
        },"Test",1>>24);

        t.start();
    }
}
