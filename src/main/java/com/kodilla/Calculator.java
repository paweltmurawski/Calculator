package com.kodilla;

public class Calculator {

    int a = 5;
    int b = 7;

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
        calculator.calculatorAdd();
        calculator.calculatorSubtract();

        System.out.println("Result off adding a to b is " + calculator.calculatorAdd());
        System.out.println("Result off subtracting a and b is " + calculator.calculatorSubtract());
    }
}


