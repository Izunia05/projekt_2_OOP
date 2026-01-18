package cinema.service;

import cinema.domain.Seat;
import cinema.domain.Show;

public class TicketService {

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
}