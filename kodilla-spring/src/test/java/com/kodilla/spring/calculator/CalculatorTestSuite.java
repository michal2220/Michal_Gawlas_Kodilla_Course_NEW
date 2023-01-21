package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {


    @Test
    public void testCalculations(){
        //Given

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator= context.getBean(Calculator.class);


        //When
        calculator.add(1,2);
        calculator.sub(8,4);
        calculator.mul(4,4);
        calculator.div(20,5);

        //Then
        //do nothing
    }
}
