package com.kodilla.good.patterns.challenges.FlightScannerNew.Airports;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Gdansk implements AirportService {

    private String name= "Gdansk";
    private List<String> destinationFlights = new ArrayList<>();
    private List<String> arrivalFlights = new ArrayList<>();
    @Override
    public List<String> getArrivalFlights() {

        arrivalFlights.add("Paryz");
        arrivalFlights.add("Warszawa");
        arrivalFlights.add("Poznan");
        arrivalFlights.add("Berlin");
        arrivalFlights.add("Krakow");

        return arrivalFlights;
    }

    public List<String> getDestinationFlights() {

        destinationFlights.add("Paryz");
        destinationFlights.add("Warszawa");
        destinationFlights.add("Poznan");
        destinationFlights.add("Wroclaw");
        destinationFlights.add("Krakow");

        return destinationFlights;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Gdansk{" +
                "name='" + name + '\'' +
                ", destinationFlights=" + destinationFlights +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gdansk gdansk = (Gdansk) o;

        if (!Objects.equals(name, gdansk.name)) return false;
        return Objects.equals(destinationFlights, gdansk.destinationFlights);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (destinationFlights != null ? destinationFlights.hashCode() : 0);
        return result;
    }
}
