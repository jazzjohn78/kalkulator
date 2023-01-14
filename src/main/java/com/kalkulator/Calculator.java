package com.kalkulator;

public class Calculator {
    public double add(double a, double b){
        return a + b;
    }

    public double subtract(double a, double b){
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("4.5 - 1.75 = " + calc.subtract(4.5, 1.75));
    }
}
