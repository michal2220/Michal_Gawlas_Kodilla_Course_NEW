package com.kodilla.good.patterns.challenges.FlightScannerNew;

import com.kodilla.good.patterns.challenges.FlightScannerNew.Airports.AirportService;

public class FlightRequest {

    private AirportService airportService;


    public FlightRequest(AirportService airportService) {
        this.airportService = airportService;
    }

    public AirportService getAirportService() {
        return airportService;
    }

}
