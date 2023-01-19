package com.kodilla.good.patterns.challenges.FlightScannerNew;

import java.util.List;

public class MainForFlightScanner {

    public static void main(String[] args) {

        SearchProcessor searchProcessor = new SearchProcessor();
        List fromCity = searchProcessor.searchFrom("Krakow");
        for (Object theList : fromCity){
            System.out.println(theList);
        }

        List toCity = searchProcessor.searchTo("Wroclaw");
        for (Object theList : toCity){
            System.out.println(theList);
        }

        List viaCity =searchProcessor.searchVia("Warszawa","Madryt");
        for (Object theList : viaCity){
            System.out.println(theList);
        }







/*        FlightRequestReceiver flightRequestReceiver = new FlightRequestReceiver();
        FlightRequestDouble flightRequestDouble= flightRequestReceiver.requestVia();
        FlightRequest flightRequest = flightRequestReceiver.request();
        SearchProcessor searchProcessor = new SearchProcessor();

        searchProcessor.searchFrom(flightRequest);
        searchProcessor.searchTo(flightRequest);
        searchProcessor.searchFromTo(flightRequestDouble);*/

    }


}
