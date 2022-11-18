package org.example;

import assignment2.ContentCoupling.Calculator;
import assignment2.ContentCoupling.Numbers;

public class Main {
    public static void main(String[] args) {

        Calculator calculator=new Calculator();
        Numbers numbers=new Numbers(2,3);
        calculator.Sum(numbers);
        System.out.println(numbers.getResult());
    }
}