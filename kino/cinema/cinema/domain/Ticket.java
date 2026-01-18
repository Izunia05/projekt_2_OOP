package cinema.domain;

import java.util.UUID;

/**
 * Abstrakcyjna klasa reprezentująca bilet kinowy.
 */
public abstract class Ticket implements Exportable {
    protected final String ticketId;
    protected final Show show;
    protected final Seat seat;
    protected final double price;
    protected final long createdAt;

    public Ticket(Show show, Seat seat, double price) {
        if (show == null || seat == null || price < 0) {
            throw new IllegalArgumentException("Nieprawidłowe parametry biletu");
        }
        this.ticketId = UUID.randomUUID().toString().substring(0, 8);
        this.show = show;
        this.seat = seat;
        this.price = price;
        this.createdAt = System.currentTimeMillis();
    }

    public String getTicketId() {
        return ticketId;
    }

    public Show getShow() {
        return show;
    }

    public Seat getSeat() {
        return seat;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getTicketType();

    @Override
    public String toCsv() {
        return String.format("%s,%s,%s,%s,%s,%.2f",
                ticketId,
                show.getFilm(),
                show.getSala().getNazwa(),
                seat.getMiejsce(),
                getTicketType(),
                price
        );
    }

    @Override
    public String toString() {
        return String.format("[%s] %s - %s (cena: %.2f zł)",
                getTicketType(), show.getFilm(), 
                seat.getMiejsce(), price);
    }
}
