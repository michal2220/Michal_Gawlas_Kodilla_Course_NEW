package com.kodilla.good.patterns.challenges.FlightScannerNew.Mapping;

import com.kodilla.good.patterns.challenges.FlightScannerNew.FlightRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightMapFrom {

    Map<String, List> bigFlightMap = new HashMap<>();

    private FlightRequest flightRequest;

    public FlightMapFrom(FlightRequest flightRequest) {
        this.flightRequest = flightRequest;
    }

    public Map<String, List> createFlightMap() {


        bigFlightMap.put(flightRequest.getAirportService().getName(), flightRequest.getAirportService().getDestinationFlights());

        return bigFlightMap;
    }
}
