package Java_Lab_2.Task3;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        AirportNetwork airportNetwork = new AirportNetwork();

        Airport airportKyiv = airportNetwork.createAirport("Kyiv");
        airportNetwork.addAirport(airportKyiv);

        Airport airportLviv = airportNetwork.createAirport("Lviv");
        airportNetwork.addAirport(airportLviv);

        Airport airportNewYork = airportNetwork.createAirport("New York");
        airportNetwork.addAirport(airportNewYork);

        Airport airportLondon = airportNetwork.createAirport("London");
        airportNetwork.addAirport(airportLondon);

        Airport airportParis = airportNetwork.createAirport("Paris");
        airportNetwork.addAirport(airportParis);

        System.out.println("Airports: ");
        airportNetwork.printAirports();

        airportNetwork.createFlight(airportKyiv, airportLviv, LocalDateTime.parse("2021-05-20T19:00:00"), LocalDateTime.parse("2021-05-20T20:00:00"));



       /* airportNetwork.deleteAirport(airportParis);*/


    }
}
