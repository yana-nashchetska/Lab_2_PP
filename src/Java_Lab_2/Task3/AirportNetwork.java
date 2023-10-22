package Java_Lab_2.Task3;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class AirportNetwork {

    private ArrayList<Airport> airports = new ArrayList<Airport>();

    private ArrayList<String> cities = new ArrayList<>();


    public void addAirport(Airport airport) {
        airports.add(airport);
    }

    public Airport createAirport(String cityName) {
        Airport airport = new Airport(cityName);
        return airport;
    }

    public void deleteAirport(Airport airport) {
        this.airports.remove(airport);
    }

    public void createFlight(Airport departureAirport, Airport arrivalAirport, LocalDateTime departureTime, LocalDateTime arrivalTime) {

        Flight flight = new Flight(departureAirport, arrivalAirport, departureTime, arrivalTime);
        departureAirport.createFlight(arrivalAirport, flight);
        arrivalAirport.createFlight(departureAirport, flight);
    }
    public void addCity(String cityName) {
        this.cities.add(cityName);
    }

    public void printAirports() {
        for (Airport airport : airports) {
            System.out.println(airport);
        }
    }
    }

