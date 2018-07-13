package com.zhangyuyang.concurrency.chapter1;


/**
 * 尝试多线程
 */
public class TryConcurrency {
    public static void main(String[] args) {
        new Thread("READ_THREAD"){
            @Override
            public void run() {
                println(Thread.currentThread().getName()+"");
                readFromDataBase();
            }
        }.start();;

       /* new Thread("WRITE_THREAD"){
            @Override
            public void run() {
                println(Thread.currentThread().getName()+"");
                writeDataToFile();
            }
        }.start();*/
    }

    private static void readFromDataBase(){
        // read data from db and handle it
        println("Begin read data from db.");
        try {
            Thread.sleep(1_000 * 30L);
            println("Read data done and handle it");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        println("The data handle finished and successfully.");
    }

    private  static void writeDataToFile(){
        println("Begin write data to file.");
        try {
            Thread.sleep(1_000 * 30L);
            println("Write data done and start handle it.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        println("the data handle finish and successfully");
    }


    private static void println(String message) {
        System.out.println(message);
    }
}
