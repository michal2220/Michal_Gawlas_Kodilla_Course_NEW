package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTestSuite {


    @Test
    public void testCalculations(){
        //Given

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator= context.getBean(Calculator.class);

        //When
        double summing = calculator.add(1,2);
        double subtracting = calculator.sub(8,4);
        double multiplying = calculator.mul(4,4);
        double dividing = calculator.div(20,5);

        //Then
        assertEquals(summing, 3);
        assertEquals(subtracting, 4);
        assertEquals(multiplying, 16);
        assertEquals(dividing, 4);
    }
}
