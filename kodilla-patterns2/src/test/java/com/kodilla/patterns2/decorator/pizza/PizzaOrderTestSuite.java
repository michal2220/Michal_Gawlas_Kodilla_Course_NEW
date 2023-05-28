package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderCost() {
        //Given
        PizzaOrder thePizza = new BasicPizza();

        //When
        BigDecimal cost = thePizza.getCost();

        //Then
        assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testBasicPizzaOrderDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizza();

        //When
        String description = thePizza.getDescription();

        //Then
        assertEquals("Pizza with: doe, tomato sauce, cheese", description);
    }

    @Test
    public void testPizzaWithAllOrderCost() {
        //Given
        PizzaOrder thePizza = new BasicPizza();
        thePizza = new MushroomDecorator(thePizza);
        thePizza = new HamDecorator(thePizza);
        thePizza = new AdditionalCheeseDecorator(thePizza);

        //When
        BigDecimal cost = thePizza.getCost();

        //Then
        assertEquals(new BigDecimal(21), cost);
    }

    @Test
    public void testPizzaWithAllOrderDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizza();
        thePizza = new MushroomDecorator(thePizza);
        thePizza = new HamDecorator(thePizza);
        thePizza = new AdditionalCheeseDecorator(thePizza);

        //When
        String description = thePizza.getDescription();

        //Then
        assertEquals("Pizza with: doe, tomato sauce, cheese, mushroom, ham, additional cheese", description);
    }
}
