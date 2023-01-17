package com.kodilla.good.patterns.challenges.FlightScannerNew.Mapping;

import com.kodilla.good.patterns.challenges.FlightScannerNew.Airports.AirportService;
import com.kodilla.good.patterns.challenges.FlightScannerNew.FlightRequestDouble;

import java.util.List;

import static com.kodilla.good.patterns.challenges.FlightScannerNew.Mapping.FlightMap.getAirportServices;

public class FlightMapVia {

    private FlightRequestDouble flightRequestDouble;

    public FlightMapVia(FlightRequestDouble flightRequestDouble) {
        this.flightRequestDouble = flightRequestDouble;
    }

    public List <AirportService> createObjectList(){
        return getAirportServices();
    }
}
