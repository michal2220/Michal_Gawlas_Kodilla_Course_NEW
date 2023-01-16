package com.kodilla.stream.AAAA.FlightScanner;

import java.util.Objects;

public class FlightRequest {

    private AirportService airportService;


    public FlightRequest(AirportService airportService) {
        this.airportService = airportService;
    }

    public AirportService getAirportService() {
        return airportService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightRequest that = (FlightRequest) o;

        return Objects.equals(airportService, that.airportService);
    }

    @Override
    public int hashCode() {
        return airportService != null ? airportService.hashCode() : 0;
    }
}
