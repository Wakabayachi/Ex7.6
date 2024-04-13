package com.kodilla.flight;

public class Main {
    public static void main(String[] args) {
        FlightService flightService = new FlightService();

        flightService.addFlight(new Flight("Gdańsk", "Wrocław"));
        flightService.addFlight(new Flight("Gdańsk", "Kraków"));
        flightService.addFlight(new Flight("Kraków", "Wrocław"));
        flightService.addFlight(new Flight("Kraków", "Warszawa"));
        flightService.addFlight(new Flight("Wrocław", "Warszawa"));

        System.out.println("Flights from Gdańsk: " + flightService.findFlightsFrom("Gdańsk"));
        System.out.println("Flights to Wrocław: " + flightService.findFlightsTo("Wrocław"));
        System.out.println("Flights via Kraków to Wrocław: " + flightService.findFlightsVia("Gdańsk", "Wrocław"));
    }
}
