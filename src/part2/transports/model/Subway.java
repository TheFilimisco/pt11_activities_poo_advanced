package part2.transports.model;

public class Subway extends  Transport{
    private double ticketPrice;

    public Subway(short speed, double ticketPrice) {
        super(speed);
        this.ticketPrice = ticketPrice;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Subway{" +
                "ticketPrice=" + ticketPrice +
                "} " + super.toString();
    }
}
