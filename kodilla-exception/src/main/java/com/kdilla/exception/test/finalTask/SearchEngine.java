package com.kdilla.exception.test.finalTask;

import java.util.HashMap;
import java.util.Map;

public class SearchEngine {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String,Boolean> flightMap = new HashMap<>();

        flightMap.put("Warszawa",false);
        flightMap.put("Kraków",false);
        flightMap.put("Rzeszów",true);
        flightMap.put("Gdynia",true);
        flightMap.put("Berlin",true);
        flightMap.put("Katowice",false);

        Map<String,Boolean> flighConfirmation = new HashMap<>();

        Boolean result = null;

        boolean checking;
        for (Map.Entry<String, Boolean> flights : flightMap.entrySet()){
            if (!flightMap.containsKey(flight.departureAirport)){
                throw new RouteNotFoundException();
            } else {

                result = flightMap.get(flight.getArrivalAirport());
            }
        }
        System.out.println(result);
        return result;


    }
}
