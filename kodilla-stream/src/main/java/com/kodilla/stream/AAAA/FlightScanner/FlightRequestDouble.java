package com.kodilla.stream.AAAA.FlightScanner;

public class FlightRequestDouble {

    private AirportService airportServiceFrom;
    private AirportService airportServiceTo;

    public FlightRequestDouble(AirportService airportServiceFrom, AirportService airportServiceTo) {
        this.airportServiceFrom = airportServiceFrom;
        this.airportServiceTo = airportServiceTo;
    }

    public AirportService getAirportServiceFrom() {
        return airportServiceFrom;
    }

    public AirportService getAirportServiceTo() {
        return airportServiceTo;
    }
}
