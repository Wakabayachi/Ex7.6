package com.kodilla.exception.test;

public class Main {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Warsaw", "Paris");
        Flight flight2 = new Flight("Berlin", "London");

        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flight1);
            flightFinder.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
