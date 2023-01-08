package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");

        world.addContinent(asia);
        world.addContinent(europe);
        world.addContinent(africa);

        asia.addCountry(new Country("China",new BigDecimal("200000000")));
        asia.addCountry(new Country("Malesia",new BigDecimal("100000000")));
        asia.addCountry(new Country("Indonesia",new BigDecimal("80000000")));
        europe.addCountry(new Country("Poland",new BigDecimal("40000000")));
        europe.addCountry(new Country("Germany",new BigDecimal("80000000")));
        africa.addCountry(new Country("Marco",new BigDecimal("10000000")));
        africa.addCountry(new Country("Algeria",new BigDecimal("7000000")));

        //When

        BigDecimal peopleCount = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleCount = new BigDecimal("517000000");
        assertEquals(expectedPeopleCount, peopleCount);
    }
}
