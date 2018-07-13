package com.zhangyuyang.concurrency.chapter3;

/**
 * 创建线程  -- stackSize ??
 */
public class CreateThreadAboutStackSize3 {
    private static int counter = 0;

    public static void main(String[] args) {
        try {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                counter++;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            add(1);
                        } catch (Error e) {

                        }
                    }
                    private void add(int i) {
                        add(i + 1);
                    }
                }).start();
            }
        }catch (Error e){
            counter++;
        }
        System.out.println("Total created Thread nums ==>"+counter);
    }
}
