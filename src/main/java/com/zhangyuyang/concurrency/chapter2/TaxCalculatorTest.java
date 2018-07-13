package com.zhangyuyang.concurrency.chapter2;

public class TaxCalculatorTest {
    public static void main(String[] args) {
        // TaxCalculator taxCalculator = new TaxCalculator(1_000d,2_000d,new SimpleCalculatorStrategyImpl());
        // Java 8 Lambda expression
        TaxCalculator taxCalculator = new TaxCalculator(1_000d,2_000d,(s,b)->s * 0.1+ b * 0.15);
        System.out.println(taxCalculator.calculate());
    }
}
