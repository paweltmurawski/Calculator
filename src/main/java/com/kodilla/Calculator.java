package com.kodilla;

public class Calculator {

    int a;
    int b;

    public void someMethod() {
       System.out.println("It works!");
    }

    public int calculatorAdd() {
        return a+b;
    }

    public int calculatorSubtract() {
        return a-b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.someMethod();
    }
}


