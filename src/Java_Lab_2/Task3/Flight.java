package Java_Lab_2.Task3;

import java.util.HashMap;
import java.util.Map;
import java.time.LocalDateTime;

public class Flight {
    private String departureCity;
    private String arrivalCity;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private Map<Ticket, Passenger> tickets = new HashMap<>();

    public Flight(String departureCity, String arrivalCity, LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public Flight(Airport departureAirport, Airport arrivalAirport, LocalDateTime departureTime, LocalDateTime arrivalTime) {
    }

    public void addTicket(Ticket ticket, Passenger passenger) {
        this.tickets.put(ticket, passenger);
    }

    @Override
    public String toString() {
        return "Flight :\n" +
                "departureCity = " + departureCity + '\'' +
                "arrivalCity = " + arrivalCity + '\n' +
                "departureTime = " + departureTime + '\n' +
                "arrivalTime = " + arrivalTime + '\n' +
                "tickets = " + tickets;
    }
}
