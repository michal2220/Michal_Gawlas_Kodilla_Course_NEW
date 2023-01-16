package com.kodilla.good.patterns.challenges.FlightScannerNew.Airports;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Warszawa implements AirportService {

    private String name = "Warszawa";
    private List<String> destinationFlights = new ArrayList<>();
    private List<String> arrivalFlights = new ArrayList<>();
    @Override
    public List<String> getArrivalFlights() {

        arrivalFlights.add("Krakow");
        arrivalFlights.add("Gdansk");
        arrivalFlights.add("Katowice");
        arrivalFlights.add("Wroclaw");

        return arrivalFlights;
    }

    public List<String> getDestinationFlights() {

        destinationFlights.add("Krakow");
        destinationFlights.add("Gdansk");
        destinationFlights.add("Katowice");
        destinationFlights.add("Wroclaw");

        return destinationFlights;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Warszawa{" +
                "name='" + name + '\'' +
                ", destinationFlights=" + destinationFlights +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Warszawa warszawa = (Warszawa) o;

        if (!Objects.equals(name, warszawa.name)) return false;
        return Objects.equals(destinationFlights, warszawa.destinationFlights);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (destinationFlights != null ? destinationFlights.hashCode() : 0);
        return result;
    }
}
