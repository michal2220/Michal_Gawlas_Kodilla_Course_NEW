package com.kodilla.good.patterns.challenges.FlightScannerNew.Airports;

import java.util.ArrayList;
import java.util.List;

public class Krakow implements AirportService {

    private String name = "Krakow";
    private List<String> destinationFlights = new ArrayList<>();
    private List<String> arrivalFlights = new ArrayList<>();

    @Override
    public List<String> getArrivalFlights() {

        arrivalFlights.add("Bygdoszcz");
        arrivalFlights.add("Warszawa");
        arrivalFlights.add("Poznan");
        arrivalFlights.add("Barceolna");

        return arrivalFlights;
    }

    @Override
    public List<String> getDestinationFlights() {

        destinationFlights.add("Bygdoszcz");
        destinationFlights.add("Warszawa");
        destinationFlights.add("Poznan");
        destinationFlights.add("Barceolna");

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
