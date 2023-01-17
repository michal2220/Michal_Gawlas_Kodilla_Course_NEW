package com.kodilla.good.patterns.challenges.FlightScannerNew;

import com.kodilla.good.patterns.challenges.FlightScannerNew.Airports.AirportService;
import com.kodilla.good.patterns.challenges.FlightScannerNew.Mapping.FlightMap;
import com.kodilla.good.patterns.challenges.FlightScannerNew.Mapping.FlightMapVia;

import java.util.List;

public class SearchProcessor {

    public void searchFrom(FlightRequest flightRequest){

        FlightMap flightMap = new FlightMap(flightRequest);
        List<AirportService> airportList = flightMap.createObjectList();

        System.out.println("Flights from " + flightRequest.getAirportService().getName() + ":");
        airportList.stream().
                filter(f->f.equals(flightRequest.getAirportService())).
                flatMap(f->f.getDestinationFlights().stream()).
                forEach(System.out::println);

        System.out.println();
    }

    public void searchTo(FlightRequest flightRequest){

        FlightMap flightMap = new FlightMap(flightRequest);
        List<AirportService> airportList = flightMap.createObjectList();

        System.out.println("Flights to " + flightRequest.getAirportService().getName() + ":");

        airportList.stream().
                filter(f->f.equals(flightRequest.getAirportService())).
                flatMap(f->f.getArrivalFlights().stream()).
                forEach(System.out::println);

        System.out.println();
    }

    public void searchFromTo (FlightRequestDouble flightRequestDouble) {

        FlightMapVia FlightMapVia = new FlightMapVia(flightRequestDouble);
        List<AirportService> objectList = FlightMapVia.createObjectList();

        System.out.println("Flights from " + flightRequestDouble.getAirportServiceFrom().getName() +
                " to " + flightRequestDouble.getAirportServiceTo().getName() +
                " available via: ");

        objectList.stream().filter(f -> f.getArrivalFlights().contains(flightRequestDouble.getAirportServiceFrom().getName()))
                .filter(f -> f.getDestinationFlights().contains(flightRequestDouble.getAirportServiceTo().getName()))
                .map(f -> f.getName())
                .forEach(System.out::println);
    }
}
