package com.kodilla.good.patterns.challenges.FlightScannerNew.Mapping;

import com.kodilla.good.patterns.challenges.FlightScannerNew.Airports.*;
import com.kodilla.good.patterns.challenges.FlightScannerNew.FlightRequestDouble;
import com.kodilla.good.patterns.challenges.FlightScannerNew.FlightRequestReceiver;

import java.util.ArrayList;
import java.util.List;

public class FlightMapVia {

    private FlightRequestDouble flightRequestDouble;
    private FlightRequestReceiver flightRequestReceiver;

    public FlightMapVia(FlightRequestDouble flightRequestDouble, FlightRequestReceiver flightRequestReceiver) {
        this.flightRequestDouble = flightRequestDouble;
        this.flightRequestReceiver = flightRequestReceiver;
    }

    public List <AirportService> createObjectList(){
        List <AirportService> objectList = new ArrayList<>();

        objectList.add(new Wroclaw());
        objectList.add(new Warszawa());
        objectList.add(new Krakow());
        objectList.add(new Gdansk());

        return objectList;
    }


/*    public Map<String,List> createArrivalMap(){

        arrivalMap.put(airportService.getName(), airportService.getArrivalFlights());
        arrivalMap.put(airportService1.getName(), airportService1.getArrivalFlights());
        arrivalMap.put(airportService2.getName(), airportService2.getArrivalFlights());
        arrivalMap.put(airportService3.getName(), airportService3.getArrivalFlights());

        return arrivalMap;
    }

    public Map<Map,Map> createMapMap (){

        mapMap.put(bigFlightMap,arrivalMap);
        return mapMap;
    }*/

   /* public Map <List, List> createFlightMap(){

        bigFlightMap.put(airportService.getArrivalFlights(), airportService.getDestinationFlights());
        bigFlightMap.put(airportService1.getArrivalFlights(), airportService1.getDestinationFlights());
        bigFlightMap.put(airportService2.getArrivalFlights(), airportService2.getDestinationFlights());
        bigFlightMap.put(airportService3.getArrivalFlights(), airportService3.getDestinationFlights());



        return bigFlightMap;
    }*/
}
