package com.kodilla.good.patterns.challenges.FlightScannerNew;

import java.util.*;

public class FlightMap {

    private Map<String, List>objectList = new HashMap<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightMap flightMap = (FlightMap) o;

        return Objects.equals(objectList, flightMap.objectList);
    }

    @Override
    public int hashCode() {
        return objectList != null ? objectList.hashCode() : 0;
    }

    public Map<String,List> getAirportServices() {
        objectList.put("Wroclaw", new ArrayList<>());
        objectList.get("Wroclaw").add("Berlin");
        objectList.get("Wroclaw").add("Praga");
        objectList.get("Wroclaw").add("Warszawa");

        objectList.put("Krakow", new ArrayList<>());
        objectList.get("Krakow").add("Barcelona");
        objectList.get("Krakow").add("Paryz");
        objectList.get("Krakow").add("Warszawa");
        objectList.get("Krakow").add("Madryt");

        objectList.put("Praga", new ArrayList<>());
        objectList.get("Praga").add("Wroclaw");
        objectList.get("Praga").add("Rzym");
        objectList.get("Praga").add("Porto");

        objectList.put("Katowice", new ArrayList<>());
        objectList.get("Katowice").add("Madryt");
        objectList.get("Katowice").add("Londyn");
        objectList.get("Katowice").add("Warszawa");
        objectList.get("Katowice").add("Krakow");
        objectList.get("Katowice").add("Wroclaw");

        objectList.put("Warszawa", new ArrayList<>());
        objectList.get("Warszawa").add("Wroclaw");
        objectList.get("Warszawa").add("Krakow");
        objectList.get("Warszawa").add("Katowice");

        return objectList;
    }
}
