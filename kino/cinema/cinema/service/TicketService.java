package cinema.service;

import java.util.ArrayList;
import java.util.List;

import cinema.domain.Auditorium;
import cinema.domain.PremiumTicket;
import cinema.domain.PricingStrategy;
import cinema.domain.Seat;
import cinema.domain.Show;
import cinema.domain.StandardTicket;
import cinema.domain.Ticket;

public class TicketService {
    private final List<Show> shows;
    private final List<Ticket> soldTickets;
    private final PricingStrategy pricingStrategy;

    public TicketService(PricingStrategy pricingStrategy) {
        this.shows = new ArrayList<>();
        this.soldTickets = new ArrayList<>();
        this.pricingStrategy = pricingStrategy;
    }

    public void dodajSeans(Show seans) {
        if (seans == null) {
            throw new IllegalArgumentException("Seans nie może być null");
        }
        shows.add(seans);
        System.out.println("✅ Dodano seans: " + seans.getOpis());
    }

    public List<Show> getSeanse() {
        return new ArrayList<>(shows);
    }

    // Metoda rezerwacji konkretnego miejsca
    public void rezerwujBilet(Show seans, int rzad, int numerMiejsca) {
        Seat miejsce = znajdzMiejsce(seans, rzad, numerMiejsca);

        if (miejsce != null) {
            try {
                // Punkt 6: Kapsułkowanie - obiekt sam pilnuje swojego stanu
                miejsce.book();
                System.out.println("SUKCES: Zarezerwowano miejsce: " + miejsce);
            } catch (IllegalStateException e) {
                // Obsługa błędu, który rzuca Twoja klasa Seat
                System.out.println("BŁĄD REZERWACJI: " + e.getMessage());
            }
        } else {
            System.out.println("BŁĄD: Nie ma takiego miejsca w sali (Rząd " + rzad + ", M " + numerMiejsca + ")");
        }
    }

    // Metoda anulowania
    public void anulujBilet(Show seans, int rzad, int numerMiejsca) {
        Seat miejsce = znajdzMiejsce(seans, rzad, numerMiejsca);

        if (miejsce != null) {
            try {
                miejsce.cancel();
                System.out.println("INFO: Anulowano rezerwację: " + miejsce);
            } catch (IllegalStateException e) {
                System.out.println("BŁĄD ANULOWANIA: " + e.getMessage());
            }
        }
    }

        // Sprzedaż biletu (na podstawie zarezerwowanego lub wolnego miejsca)
    public Ticket sprzedajBilet(Show seans, int rzad, int numerMiejsca, boolean premium) {
        Seat miejsce = znajdzMiejsce(seans, rzad, numerMiejsca);
        if (miejsce == null) {
            throw new IllegalArgumentException("Nie ma takiego miejsca w sali (Rząd "
                    + rzad + ", M " + numerMiejsca + ")");
        }

        if (!miejsce.isAvailable()) {
            // Możesz chcieć tu dopuścić: RESERVED -> SOLD; jeśli tak, usuń ten warunek
            System.out.println("Miejsce " + miejsce + " nie jest dostępne do sprzedaży");
            return null;
        }

        Auditorium sala = seans.getSala();
        double basePrice = pricingStrategy.calculatePrice(sala, seans.getStartTime());

        Ticket ticket = premium
                ? new PremiumTicket(seans, miejsce, basePrice)
                : new StandardTicket(seans, miejsce, basePrice);

        // oznaczamy miejsce jako sprzedane
        miejsce.cancel();
        soldTickets.add(ticket);

        System.out.println("SPRZEDANO BILET: " + ticket);
        return ticket;
    }

    // Wyświetlanie mapy sali
    public void wyswietlStanSali(Show seans) {
        System.out.println("\nMapa sali na film: " + seans.getOpis());
        int obecnyRzad = 1;

        for (Seat s : seans.getMiejsca()) {
            if (s.getRzad() > obecnyRzad) {
                System.out.println(); // Nowa linia
                obecnyRzad = s.getRzad();
            }
            // [X] zajęte, [ ] wolne
            System.out.print(s.isAvailable() ? "[_] " : "[X] ");
        }
        System.out.println("\n--------------------------------");
    }

    // Metoda prywatna pomocnicza
    private Seat znajdzMiejsce(Show seans, int rzad, int numerMiejsca) {
        for (Seat s : seans.getMiejsca()) {
            // Używamy getterów, które dodałaś w Kroku 1
            if (s.getRzad() == rzad && s.getMiejsce() == numerMiejsca) {
                return s;
            }
        }
        return null;
    }

    // Opcjonalne: statystyki sprzedaży
    public List<Ticket> getSprzedaneBilety() {
        return new ArrayList<>(soldTickets);
    }
}