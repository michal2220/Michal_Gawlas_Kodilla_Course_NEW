package com.kodilla.stream.AAAA.FlightScanner;

import java.util.ArrayList;
import java.util.List;

public class Krakow implements AirportService{

    private String name = "Krakow";
    private List<AirportService> destinationFlights = new ArrayList<>();

    @Override
    public List<AirportService> getDestinationFlights() {

        destinationFlights.add(new Gdansk());
        destinationFlights.add(new Warszawa());
        destinationFlights.add(new Gdansk());



        return destinationFlights;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Krakow{" +
                "name='" + name + '\'' +
                ", destinationFlights=" + destinationFlights +
                '}';
    }
}
