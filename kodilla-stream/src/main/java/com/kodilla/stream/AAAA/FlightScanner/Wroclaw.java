package com.kodilla.stream.AAAA.FlightScanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Wroclaw implements AirportService {

    private String name = "Wroclaw";
    private List<AirportService> destinationFlights = new ArrayList<>();

    public List<AirportService> getDestinationFlights() {


        destinationFlights.add(new Krakow());



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
