package com.bridgelabz.Example;

public class SwapNumber {
    public static void main(String[] args) {
        int num1= 10;
        int num2= 20;
        System.out.println("Number before swapping: " +num1+ "," +num2);
        num1=num1 + num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("Number after swapping: " +num1+ ","+num2);

    }
}
