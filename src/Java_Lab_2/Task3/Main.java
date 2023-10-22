package Java_Lab_2.Task3;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Main {


    public static void main(String... args) {

        Plane plane1 = new Plane("Windsor", "Boeing 737", "good");
        Flight flight1 = new Flight(LocalDateTime.of(2020, 10, 13, 11, 11),
                LocalDateTime.of(2020, 10, 14, 11, 11),
                "Kyiv", "Lviv", plane1);
        flight1.addTicket("John", "Doe");
        flight1.addTicket("Mary", "Doe");
        flight1.addTicket("Petro", "Doe");

        System.out.println("Before editing ticket");
        flight1.printFlightInfo();
        System.out.println();
        System.out.println();

        System.out.println("After deleting ticket");
        flight1.cancelTicket("John", "Doe");
        flight1.printFlightInfo();

        System.out.println("====================================");
        System.out.println();

        Flight flight2 = new Flight(LocalDateTime.of(2020, 10, 13, 11, 11),
                LocalDateTime.of(2020, 10, 15, 11, 11),
                "Kyiv", "NewYork", plane1);

        FlightSchedule flightScheduleKyivMorning = new FlightSchedule();
        flightScheduleKyivMorning.addFlight(flight1);

        flight2.addTicket("Yana", "Nashchetska");
        flight2.addTicket("Olenka", "Pyatkovska");
        flightScheduleKyivMorning.addFlight(flight2);

        flightScheduleKyivMorning.printSchedule();

        System.out.println();
        System.out.println();

        System.out.println("After editing ticket");
        flight2.editTicket("Yana", "Nashchetska", "Jane", "Winchester");
        System.out.println();

        flightScheduleKyivMorning.printSchedule();

        System.out.println();
        System.out.println();

        System.out.println("After deleting flight1");
        flightScheduleKyivMorning.deleteFlight(flight1);

        flightScheduleKyivMorning.printSchedule();

        flightScheduleKyivMorning.editFlight(flight2, "Kansas-city");
        System.out.println("After editing flight2");
        flightScheduleKyivMorning.printSchedule();

        System.out.println("====================================");
        System.out.println();

        Plane plane2 = new Plane("Windsor", "Boeing 737", "good");

        FlightSchedule flightScheduleKyivEvening = new FlightSchedule();


        ArrayList <FlightSchedule> flightSchedulesKyiv = new ArrayList<>();
        flightSchedulesKyiv.add(flightScheduleKyivMorning);
        flightSchedulesKyiv.add(flightScheduleKyivEvening);

        ArrayList<Plane> planesKyiv = new ArrayList<>();
        planesKyiv.add(plane1);
        planesKyiv.add(plane2);

        Airport airportKyiv = new Airport("Kyiv", flightSchedulesKyiv, planesKyiv);

        airportKyiv.editPlane(plane2, "bad");
        Flight flight3 = new Flight(LocalDateTime.of(2020, 10, 13, 11, 11),
                LocalDateTime.of(2020, 10, 14, 11, 11),
                "Kyiv", "Lviv", plane2);

        flightScheduleKyivMorning.addFlight(flight3);
        flightScheduleKyivMorning.printSchedule();

    }
}
