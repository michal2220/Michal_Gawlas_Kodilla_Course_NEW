package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {

    private Set<Continent> world = new HashSet<>();


    
    public void addContinent(Continent continent){
        world.add(continent);
    }

    public BigDecimal getPeopleQuantity(){

        BigDecimal peopleInTheWorld= world.stream()
                .flatMap(world->world.getCountrySet().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum,current)->sum=sum.add(current));

        return peopleInTheWorld;
    }
}
