package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int addResult = calculator.add(3,4);

        if(addResult==7){
            System.out.println("Adding is ok");
        }else{
            System.out.println("Adding is not ok");
        }

        int subResult = calculator.subtract(20,10);


        if (subResult==10){
            System.out.println("Subtracting is ok");
        }else{
            System.out.println("Subtracting is not ok");
        }
    }
}
