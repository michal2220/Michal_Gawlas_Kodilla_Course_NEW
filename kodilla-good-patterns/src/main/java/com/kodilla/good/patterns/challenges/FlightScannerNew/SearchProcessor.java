package com.kodilla.good.patterns.challenges.FlightScannerNew;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SearchProcessor {

    public List searchFrom(String airport) {
        FlightMap flightMap = new FlightMap();
        Map<String, List> airportMap = flightMap.getAirportServices();

        System.out.println();
        System.out.println("Flights from " + airport + " to: ");
        List result = airportMap.entrySet().stream()
                .filter(f -> f.getKey().contains(airport))
                .flatMap(f -> f.getValue().stream()).map(f->f.toString()).toList();

        return result;
    }

    public List searchTo(String airport) {
        FlightMap flightMap = new FlightMap();
        Map<String, List> airportMap = flightMap.getAirportServices();

        System.out.println();
        System.out.println("Flights to " + airport + " from: ");
        List result = airportMap.entrySet().stream()
                .filter(f -> f.getValue().contains(airport))
                .map(f -> f.getKey()).map(f->f.toString()).toList();

        return result;
    }

    public List searchVia(String airportFrom, String airportTo) {
        FlightMap flightMap = new FlightMap();
        Map<String, List> airportMap = flightMap.getAirportServices();

        System.out.println();
        System.out.println("Flights from " + airportFrom + " to " + airportTo + " via: ");

        List<String> firstList = (List<String>) airportMap.entrySet().stream()
                .filter(f -> f.getKey().contains(airportFrom))
                .flatMap(f -> f.getValue().stream())
                .map(f -> f.toString())
                .collect(Collectors.toList());

        List<String> secondList = airportMap.entrySet().stream()
                .filter(f -> f.getValue().contains(airportTo))
                .map(f -> f.getKey())
                .collect(Collectors.toList());

        firstList.retainAll(secondList);

        return firstList;
    }
    /*

    Czy mógłbyś prosze zerknąć dlaczego poniższy kod mi nie działał(kompilował się, lecz System.out::println nie zwracał nic do konsoli?


            airportMap.entrySet().stream()
                .filter(f->f.getKey().contains(airportFrom))
                .flatMap(f->f.getValue().stream())
                .map(f->f.toString())
                .filter(i->i.equals(
                        airportMap.entrySet().stream()
                                .filter(f->f.getValue().contains(airportTo))
                                .map(f->f.getKey())))
                                .forEach(System.out::println);
    *
    Komentarz:
        I w tej "pierwszej części" zwraca mi String, czyli:

                    airportMap.entrySet().stream()
                .filter(f->f.getKey().contains(airportFrom))
                .flatMap(f->f.getValue().stream())
                .map(f->f.toString())

        i w drugiej też:
                        .filter(i->i.equals(
                        airportMap.entrySet().stream()
                                .filter(f->f.getValue().contains(airportTo))
                                .map(f->f.getKey())))
                                .forEach(System.out::println);


    * */

}
