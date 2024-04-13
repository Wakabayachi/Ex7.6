package com.kodilla.flight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> findFlightsFrom(String city) {
        return flights.stream()
                .filter(flight -> flight.getDepartureCity().equals(city))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsTo(String city) {
        return flights.stream()
                .filter(flight -> flight.getDestinationCity().equals(city))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsVia(String viaCity, String destinationCity) {
        return flights.stream()
                .filter(flight -> flight.getDepartureCity().equals(viaCity))
                .flatMap(flight -> flights.stream()
                        .filter(f -> f.getDepartureCity().equals(viaCity) && f.getDestinationCity().equals(destinationCity)))
                .collect(Collectors.toList());
    }
}