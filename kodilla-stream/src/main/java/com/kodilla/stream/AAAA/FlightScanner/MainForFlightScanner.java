package com.kodilla.stream.AAAA.FlightScanner;

public class MainForFlightScanner {

    public static void main(String[] args) {

        FlightRequestReceiver flightRequestReceiver = new FlightRequestReceiver();
        FlightRequest flightRequest = flightRequestReceiver.request();
        SearchProcessor searchProcessor = new SearchProcessor();

        searchProcessor.searchFrom(flightRequest);
        searchProcessor.searchTo(flightRequest);

    }


}
