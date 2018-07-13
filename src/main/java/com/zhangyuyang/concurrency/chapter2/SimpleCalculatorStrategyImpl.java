package com.zhangyuyang.concurrency.chapter2;

/**
 *  简单实现
 */
public class SimpleCalculatorStrategyImpl implements CalculatorStrategy {
    private static final double SALARY_RATE = 0.1;

    private static final double BONUS_RATE = 0.15;

    @Override
    public double calculate(double salary, double bonus) {
        return salary * SALARY_RATE + bonus * BONUS_RATE;
    }
}
