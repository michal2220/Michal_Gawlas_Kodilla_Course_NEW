package com.kodilla.good.patterns.challenges.FlightScannerNew;

public class MainForFlightScanner {

    public static void main(String[] args) {

        FlightRequestReceiver flightRequestReceiver = new FlightRequestReceiver();
        FlightRequestDouble flightRequestDouble= flightRequestReceiver.requestVia();
        FlightRequest flightRequest = flightRequestReceiver.request();
        SearchProcessor searchProcessor = new SearchProcessor();

        searchProcessor.searchFrom(flightRequest);
        searchProcessor.searchTo(flightRequest);
        searchProcessor.searchFromTo(flightRequestDouble);

    }


}
