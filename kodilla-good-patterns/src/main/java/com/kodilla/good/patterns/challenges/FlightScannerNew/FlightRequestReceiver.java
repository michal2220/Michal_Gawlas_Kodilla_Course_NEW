package com.kodilla.good.patterns.challenges.FlightScannerNew;

import com.kodilla.good.patterns.challenges.FlightScannerNew.Airports.AirportService;
import com.kodilla.good.patterns.challenges.FlightScannerNew.Airports.Krakow;
import com.kodilla.good.patterns.challenges.FlightScannerNew.Airports.Warszawa;
import com.kodilla.good.patterns.challenges.FlightScannerNew.Airports.Wroclaw;

public class FlightRequestReceiver {

    public FlightRequest request(){

        AirportService airportService = new Wroclaw();

        return new FlightRequest(airportService);
    }
    public FlightRequestDouble requestVia(){

        AirportService airportServiceFrom = new Warszawa();
        AirportService airportServiceTo = new Krakow();

        return new FlightRequestDouble(airportServiceFrom, airportServiceTo);
    }

}
