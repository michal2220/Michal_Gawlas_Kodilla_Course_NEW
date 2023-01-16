package com.kodilla.stream.AAAA.FlightScanner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightMapVia implements FlightMapService{

    Krakow airportService = new Krakow();
    Gdansk airportService1 = new Gdansk();
    Warszawa airportService2 = new Warszawa();
    Wroclaw airportService3 = new Wroclaw();
    Map<String, List> bigFlightMap = new HashMap<>();


    private FlightRequestDouble FlightRequestDouble;

    public FlightMapVia(com.kodilla.stream.AAAA.FlightScanner.FlightRequestDouble flightRequestDouble) {
        FlightRequestDouble = flightRequestDouble;
    }

    public Map <String, List> createFlightMap(){

        bigFlightMap.put(airportService.getName(), airportService.getDestinationFlights());
        bigFlightMap.put(airportService1.getName(), airportService1.getDestinationFlights());
        bigFlightMap.put(airportService2.getName(), airportService2.getDestinationFlights());
        bigFlightMap.put(airportService3.getName(), airportService3.getDestinationFlights());

        return bigFlightMap;
    }
}
