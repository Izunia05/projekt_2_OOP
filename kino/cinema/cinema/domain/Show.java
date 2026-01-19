package cinema.domain;

import java.time.LocalDateTime;
import java.util.List;
import java.time.format.DateTimeFormatter;


public class Show implements Bookable {

    private final String film;
    private final Auditorium sala;
    private final LocalDateTime czasStartu;
    private final List<Seat> miejsca;

    public Show(String film, Auditorium sala, LocalDateTime czasStartu, List<Seat> miejsca) {
        if (film == null || film.isBlank()) {
            throw new IllegalArgumentException("Film nie może być pusty.");
        }
        if (sala == null) {
            throw new IllegalArgumentException("Sala nie może być null.");
        }
        if (czasStartu.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("Czas startu musi być w przyszłości.");
        }
        if (miejsca == null || miejsca.isEmpty()) {
            throw new IllegalArgumentException("Seans musi mieć miejsca.");
        }

        this.film = film;
        this.sala = sala;
        this.czasStartu = czasStartu;
        this.miejsca = miejsca;
    }

    @Override
    public void book() {
        for (Seat seat : miejsca) {
            if (seat.isAvailable()) {
                seat.book();
                return;
            }
        }
        throw new IllegalStateException("Brak wolnych miejsc na seans.");
    }

    @Override
    public void cancel() {
        for (Seat seat : miejsca) {
            if (!seat.isAvailable()) {
                seat.cancel();
                return;
            }
        }
        throw new IllegalStateException("Brak rezerwacji do anulowania.");
    }

    public List<Seat> getMiejsca() {
        return miejsca;
    }

    public String getFilm() {
        return film;
    }

    public String getOpis() {
        return film + " (" + getStartTimeFormatted() + ")";
    }

    public Auditorium getSala() {
        return sala;
    }

    @Override
    public boolean isAvailable() {
        return miejsca.stream().anyMatch(Seat::isAvailable);
    }

    private static final DateTimeFormatter SHORT_DATE_TIME =
        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); // np. 2026-01-19 18:55

    public LocalDateTime getStartTime() {
        return czasStartu;
    }

    public String getStartTimeFormatted() {
        return czasStartu.format(SHORT_DATE_TIME);
    }
}
