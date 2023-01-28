package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    public void BigmacBuilderTest(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("With sesame")
                .burgers(1)
                .sauce("classic")
                .ingredient("onion")
                .ingredient("lettuce")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();

        //Then
        assertEquals(2,howManyIngredients);
        assertEquals(1,howManyBurgers);
    }
}
