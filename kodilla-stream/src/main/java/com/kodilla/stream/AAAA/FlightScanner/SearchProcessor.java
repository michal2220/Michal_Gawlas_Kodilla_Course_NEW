package com.kodilla.stream.AAAA.FlightScanner;

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
/*        Map<String, AirportService> flightMap = flightMapTo.createFlightMap();*/
        List<AirportService> aList =flightMapTo.createFlightMap();

        System.out.println();
        System.out.println("STARTTTT!    " + aList);
        System.out.println("DUPA");
        for (AirportService op : aList) {
            System.out.println(op);
        }
        System.out.println();

        System.out.println("Flights to " + flightRequest.getAirportService().getName() + " from:");

        aList.stream().
                filter(f->f.getDestinationFlights().contains(flightRequest.getAirportService())).

                map(f->f.getName()).


               /* map(f->f.flightRequest.getAirportService()).
                filter(f->f.equals(flightRequest.getAirportService())).
*/


                forEach(System.out::println);

        System.out.println();
    }

 /*   public void searchFromTo (FlightRequestDouble flightRequestDouble){


        FlightMapVia FlightMapVia = new FlightMapVia(flightRequestDouble);
        Map<String, List> flightMap = FlightMapVia.createFlightMap();

        System.out.println("Flights from " + flightRequestDouble.getAirportServiceFrom().getName() +
                " to " + flightRequestDouble.getAirportServiceTo());

        flightMap.entrySet().stream().
                flatMap(f->f.getValue().stream()).
                map(f->f.)

    }*/

}
