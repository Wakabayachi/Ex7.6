package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    private Map<String, Boolean> availableAirports;

    public FlightFinder() {
        availableAirports = new HashMap<>();
        availableAirports.put("Warsaw", true);
        availableAirports.put("Paris", true);
        availableAirports.put("Berlin", false);
        availableAirports.put("London", true);
        availableAirports.put("Madrid", false);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        if (!availableAirports.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Route not found for airport: " + flight.getArrivalAirport());
        }
        System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " found.");
    }
}