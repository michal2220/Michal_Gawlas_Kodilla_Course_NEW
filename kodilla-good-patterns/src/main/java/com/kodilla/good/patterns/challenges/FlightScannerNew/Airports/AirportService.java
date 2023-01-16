package com.kodilla.good.patterns.challenges.FlightScannerNew.Airports;

import java.util.List;

public interface AirportService {


    List<String> getDestinationFlights();
    List<String> getArrivalFlights();
    String getName();


}
