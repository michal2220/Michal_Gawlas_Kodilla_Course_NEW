package com.kodilla.good.patterns.challenges.FlightScannerNew;

import com.kodilla.good.patterns.challenges.FlightScannerNew.Airports.AirportService;
import com.kodilla.good.patterns.challenges.FlightScannerNew.Mapping.FlightMapFrom;
import com.kodilla.good.patterns.challenges.FlightScannerNew.Mapping.FlightMapTo;
import com.kodilla.good.patterns.challenges.FlightScannerNew.Mapping.FlightMapVia;

import java.util.List;
import java.util.Map;

public class SearchProcessor {

    public void searchFrom(FlightRequest flightRequest){

        FlightMapFrom flightMapFrom = new FlightMapFrom(flightRequest);
        Map<String, List> flightMap = flightMapFrom.createFlightMap();

        System.out.println("Flights from " + flightRequest.getAirportService().getName() + ":");
        flightMap.entrySet().stream().
                flatMap(f->f.getValue().stream()).
                forEach(System.out::println);

        System.out.println();
    }

    public void searchTo(FlightRequest flightRequest){

        FlightMapTo flightMapTo = new FlightMapTo(flightRequest);
        Map<String, List> flightMap = flightMapTo.createFlightMap();

        System.out.println("Flights to " + flightRequest.getAirportService().getName() + ":");

        flightMap.entrySet().stream().
                filter(f->f.getValue().contains(flightRequest.getAirportService().getName())).
                map(f->f.getKey()).
                forEach(System.out::println);

        System.out.println();
    }

    public void searchFromTo (FlightRequestDouble flightRequestDouble) {

        FlightMapVia FlightMapVia = new FlightMapVia(flightRequestDouble);
        List<AirportService> objectList = FlightMapVia.createObjectList();

        System.out.println("Flights from " + flightRequestDouble.getAirportServiceFrom().getName() +
                " to " + flightRequestDouble.getAirportServiceTo().getName());

        objectList.stream().filter(f -> f.getArrivalFlights().contains(flightRequestDouble.getAirportServiceFrom().getName()))
                .filter(f -> f.getDestinationFlights().contains(flightRequestDouble.getAirportServiceTo().getName()))
                .map(f -> f.getName())
                .forEach(System.out::println);
    }
/*
Tu są różne rzeczy, których próbowałem, zostawiam na wszelki wypadek :)

Map<List, List> flightMap = FlightMapVia.createFlightMap();
        flightMap.entrySet().stream().
                filter(f->f.getKey().contains(flightRequestReceiver.requestVia().getAirportServiceTo().getName())).
                filter(f->f.getValue().contains(flightRequestReceiver.requestVia().getAirportServiceFrom().getName())).
                forEach(System.out::println);*/


}
