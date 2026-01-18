package cinema.domain;

public class StandardTicket extends Ticket {
    public StandardTicket(Show show, Seat seat, double price) {
        super(show, seat, price);
    }

    @Override
    public String getTicketType() {
        return "Standard";
    }
}
