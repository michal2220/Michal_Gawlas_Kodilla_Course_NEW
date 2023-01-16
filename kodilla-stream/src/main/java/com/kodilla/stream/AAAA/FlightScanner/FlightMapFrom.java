package com.kodilla.stream.AAAA.FlightScanner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightMapFrom implements FlightMapService{

    Map<String, List> bigFlightMap = new HashMap<>();


    private FlightRequest flightRequest;

    public FlightMapFrom(FlightRequest flightRequest) {
        this.flightRequest = flightRequest;
    }

    @Override
    public Map<String, List> createFlightMap() {


        bigFlightMap.put(flightRequest.getAirportService().getName(), flightRequest.getAirportService().getDestinationFlights());

        return bigFlightMap;
    }
}
