package com.itacademy.nivel3.exercise1;

public class Calculator {
    private int total = 0;

    public int getTotal() {
        return total;
    }

    public void add(int num) {
        total += num;
    }

    public void subtract(int num) {
        total -= num;
    }

    public void multiply(int num) {
        total *= num;
    }

    public void divide(int num) {
        if (num == 0) {
            throw new ArithmeticException("Error: division by 0 is not possible");
        }
        total /= num;
    }

    public void reset() {
        total = 0;
    }
}
