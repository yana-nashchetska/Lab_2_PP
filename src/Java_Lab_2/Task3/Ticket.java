package Java_Lab_2.Task3;

import java.time.LocalDateTime;
import java.util.UUID;
public class Ticket {
    private UUID tickedID;
    private int seatNumber;

    private double ticketPrice;

    public Ticket() {
        this.tickedID = UUID.randomUUID();
        this.setSeatNumber((int) (Math.random() * 100));
    }
    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(LocalDateTime flyTime) {
        switch (flyTime.getDayOfMonth()) {
            case 1:
                this.ticketPrice = 50;
               break;
                case 2:
                this.ticketPrice = 100;

                break;
                case 3:
                this.ticketPrice = 150;
                break;
            default:
                this.ticketPrice = 200;
                break;
        }
    }

    public Ticket(UUID tickedID, int seatNumber, double ticketPrice) {
        this.tickedID = tickedID;
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;
    }


    public Ticket buyTicket() {
        return new Ticket();
    }

    public void cancelTicket() {
        this.tickedID = null;
        this.seatNumber = 0;
        this.ticketPrice = 0;
    }
}
