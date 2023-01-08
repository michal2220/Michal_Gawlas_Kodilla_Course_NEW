package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private final BigDecimal peopleCount;
    private final String countryName;

    public Country(String countryName , BigDecimal peopleCount) {
        this.peopleCount = peopleCount;
        this.countryName = countryName;
    }

    public BigDecimal getPeopleQuantity(){
        return  peopleCount;
    }

}
