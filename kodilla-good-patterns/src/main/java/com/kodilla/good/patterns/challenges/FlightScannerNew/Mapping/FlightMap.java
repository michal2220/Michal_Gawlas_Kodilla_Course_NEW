package com.kodilla.good.patterns.challenges.FlightScannerNew.Mapping;

import com.kodilla.good.patterns.challenges.FlightScannerNew.Airports.*;
import com.kodilla.good.patterns.challenges.FlightScannerNew.FlightRequest;

import java.util.ArrayList;
import java.util.List;

public class FlightMap {

    private FlightRequest flightRequest;

    public FlightMap(FlightRequest flightRequest) {
        this.flightRequest = flightRequest;
    }

    public List <AirportService> createObjectList(){
        return getAirportServices();
    }

    public static List<AirportService> getAirportServices() {
        List <AirportService> objectList = new ArrayList<>();

        objectList.add(new Wroclaw());
        objectList.add(new Warszawa());
        objectList.add(new Krakow());
        objectList.add(new Gdansk());

        return objectList;
    }
}
