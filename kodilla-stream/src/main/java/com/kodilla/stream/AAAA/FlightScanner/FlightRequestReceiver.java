package com.kodilla.stream.AAAA.FlightScanner;

public class FlightRequestReceiver {

    public FlightRequest request(){

        AirportService airportService = new Wroclaw();

        return new FlightRequest (airportService);
    }
    public FlightRequestDouble requestVia(){

        AirportService airportServiceFrom = new Gdansk();
        AirportService airportServiceTo = new Krakow();

        return new FlightRequestDouble(airportServiceFrom, airportServiceTo);
    }

}
