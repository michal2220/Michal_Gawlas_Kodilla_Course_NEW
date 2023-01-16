package com.kodilla.good.patterns.challenges.FlightScannerNew.Mapping;

import com.kodilla.good.patterns.challenges.FlightScannerNew.Airports.*;
import com.kodilla.good.patterns.challenges.FlightScannerNew.FlightRequest;

import java.util.*;

public class FlightMapTo{

    Krakow airportService = new Krakow();
    Gdansk airportService1 = new Gdansk();
    Warszawa airportService2 = new Warszawa();
    Wroclaw airportService3 = new Wroclaw();
    Map<String, List> bigFlightMap = new HashMap<>();


    private FlightRequest flightRequest;

    public FlightMapTo(FlightRequest flightRequest) {
        this.flightRequest = flightRequest;
    }

    public Map<String, List> createFlightMap(){
        Map<String, List> bigMap =  new HashMap<>();
        bigFlightMap.put(airportService.getName(), airportService.getDestinationFlights());
        bigFlightMap.put(airportService1.getName(), airportService1.getDestinationFlights());
        bigFlightMap.put(airportService2.getName(), airportService2.getDestinationFlights());
        bigFlightMap.put(airportService3.getName(), airportService3.getDestinationFlights());

        return bigFlightMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightMapTo that = (FlightMapTo) o;

        if (!Objects.equals(airportService, that.airportService))
            return false;
        if (!Objects.equals(airportService1, that.airportService1))
            return false;
        if (!Objects.equals(airportService2, that.airportService2))
            return false;
        if (!Objects.equals(airportService3, that.airportService3))
            return false;
        if (!Objects.equals(bigFlightMap, that.bigFlightMap)) return false;
        return Objects.equals(flightRequest, that.flightRequest);
    }

    @Override
    public int hashCode() {
        int result = airportService != null ? airportService.hashCode() : 0;
        result = 31 * result + (airportService1 != null ? airportService1.hashCode() : 0);
        result = 31 * result + (airportService2 != null ? airportService2.hashCode() : 0);
        result = 31 * result + (airportService3 != null ? airportService3.hashCode() : 0);
        result = 31 * result + (bigFlightMap != null ? bigFlightMap.hashCode() : 0);
        result = 31 * result + (flightRequest != null ? flightRequest.hashCode() : 0);
        return result;
    }
}
