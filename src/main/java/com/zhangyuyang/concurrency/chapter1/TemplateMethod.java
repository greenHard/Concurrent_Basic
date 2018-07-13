package com.zhangyuyang.concurrency.chapter1;

public class TemplateMethod {
    public final void print(String message){
        System.out.println("########");
        warpPrint(message);
        System.out.println("########");
    }

    protected void warpPrint(String message) {
    }

    public static void main(String[] args) {
        TemplateMethod t1 = new TemplateMethod(){
            @Override
            protected void warpPrint(String message) {
                System.out.println("*"+message+"*");
            }
        };
        System.out.println("Hello  Thread");

        TemplateMethod t2 = new TemplateMethod(){
            @Override
            protected void warpPrint(String message) {
                System.out.println("*"+message+"*");
            }
        };
        System.out.println("Hello  Thread");
    }
}
