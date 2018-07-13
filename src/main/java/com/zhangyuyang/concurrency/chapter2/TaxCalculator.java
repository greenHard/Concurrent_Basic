package com.zhangyuyang.concurrency.chapter2;

/**
 * 税率计算
 */
public class TaxCalculator {
    private final double salary;

    private final double bonus;

    private final CalculatorStrategy calculatorStrategy;

    public TaxCalculator(double salary, double bonus, CalculatorStrategy calculatorStrategy) {
        this.salary = salary;
        this.bonus = bonus;
        this.calculatorStrategy = calculatorStrategy;
    }

    private double calcTax() {
        return calculatorStrategy.calculate(salary, bonus);
    }

    public double calculate() {
        return this.calcTax();
    }
}
