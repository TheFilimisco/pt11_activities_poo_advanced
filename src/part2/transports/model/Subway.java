package part2.transports.model;

public class Subway extends  Transport{
    private double ticketPrice;
    private final double TICKET_PRICE_BY_KM = 1;
    private final double EACH_KM_UPDATE_PRICE = 5;


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
    public double getPriceByDistanceTraveled(int distanceTraveled) {
        return ((distanceTraveled/EACH_KM_UPDATE_PRICE) * TICKET_PRICE_BY_KM) + ticketPrice;
    }

    public double getTICKET_PRICE_BY_KM() {
        return TICKET_PRICE_BY_KM;
    }

    public double getEACH_KM_UPDATE_PRICE() {
        return EACH_KM_UPDATE_PRICE;
    }

    @Override
    public String toString() {
        return "Subway{" +
                "ticketPrice=" + ticketPrice +
                "} " + super.toString();
    }
}
