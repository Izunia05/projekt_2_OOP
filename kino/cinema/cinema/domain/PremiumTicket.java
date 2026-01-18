package cinema.domain;

public class PremiumTicket extends Ticket {
    private static final double PREMIUM_MARKUP = 1.5;

    public PremiumTicket(Show show, Seat seat, double basePrice) {
        super(show, seat, basePrice * PREMIUM_MARKUP);
    }

    @Override
    public String getTicketType() {
        return "Premium";
    }
}
