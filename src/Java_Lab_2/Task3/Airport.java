package Java_Lab_2.Task3;

import java.util.ArrayList;

public class Airport {
    private String cityName;
    private ArrayList<Flight> allFlights = new ArrayList<>();

    public String getCityName() {
        return cityName;
    }
    public Airport(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Airport in " + cityName + '\n' +
                "allFlights: " + allFlights;
    }

    public void createFlight(Airport arrivalAirport, Flight flight) {
    }
}
