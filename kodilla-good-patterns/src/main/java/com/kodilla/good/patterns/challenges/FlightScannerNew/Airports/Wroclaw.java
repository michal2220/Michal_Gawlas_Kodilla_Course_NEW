package com.kodilla.good.patterns.challenges.FlightScannerNew.Airports;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Wroclaw implements AirportService {

    private String name = "Wroclaw";
    private List<String> destinationFlights = new ArrayList<>();
    private List<String> arrivalFlights = new ArrayList<>();
    @Override
    public List<String> getArrivalFlights() {

        arrivalFlights.add("Warszawa");
        arrivalFlights.add("Gdansk");

        return arrivalFlights;
    }

    public List<String> getDestinationFlights() {

        destinationFlights.add("Warszawa");
        destinationFlights.add("Bydgoszcz");

        return destinationFlights;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Wroclaw{" +
                "name='" + name + '\'' +
                ", destinationFlights=" + destinationFlights +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wroclaw wroclaw = (Wroclaw) o;

        if (!Objects.equals(name, wroclaw.name)) return false;
        return Objects.equals(destinationFlights, wroclaw.destinationFlights);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (destinationFlights != null ? destinationFlights.hashCode() : 0);
        return result;
    }
}
