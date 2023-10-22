package Java_Lab_2.Task3;

import java.time.LocalDateTime;

public class Ticket extends Passenger{
    private double price;

    public Ticket(String firstName, String lastName, LocalDateTime departureTime, LocalDateTime arrivalTime) {
        super(firstName, lastName);
        if (arrivalTime.getDayOfMonth() - departureTime.getDayOfMonth() == 0) {
            this.price = 100;
        } else if (arrivalTime.getDayOfMonth() - departureTime.getDayOfMonth() == 1) {
            this.price = 200;
        } else {
            this.price = 300;
        }
    }

    public double getPrice() {
        return price;
    }

    //flight.createTicked("John", "Doe", "2021-10-10T10:00:00", "2021-10-10T12:00:00");
    //flight.addTicket(ticket);
 /*   public Ticket createTicket(String firstName, String lastName, LocalDateTime departureTime, LocalDateTime arrivalTime) {
        return new Ticket(firstName, lastName, departureTime, arrivalTime);
    }*/

/*    public void printTicket() {
        System.out.println(this);
    }*/
    @Override
    public String toString() {


        return "\nTicket :" +'\n' +
                "Passenger info :" + '\n' +
                "id = " + getId() + '\n' +
                "firstName: " + getFirstName() + '\n' +
                "lastName: " + getLastName() + '\n' +
                "price: " + price;
    }
}
