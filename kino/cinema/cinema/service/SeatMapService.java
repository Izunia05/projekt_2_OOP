package cinema.service;

import cinema.domain.Auditorium;
import cinema.domain.Seat;
import cinema.domain.StandardAuditorium;
import java.util.ArrayList;
import java.util.List;

public class SeatMapService {

    public List<Seat> generujMape(Auditorium sala) {
        List<Seat> miejsca = new ArrayList<>();
        int iloscMiejscWRzedzie = 10; // Domyślna wartość

        // Sprawdzamy, czy sala to nasza Standardowa Sala, żeby wiedzieć ile jest miejsc w rzędzie
        if (sala instanceof StandardAuditorium) {
            iloscMiejscWRzedzie = ((StandardAuditorium) sala).getMiejscaWRzedzie();
        }

        // Pętle generujące miejsca
        for (int rzad = 1; rzad <= sala.getLiczbaRzedow(); rzad++) {
            for (int nr = 1; nr <= iloscMiejscWRzedzie; nr++) {
                // Tworzymy nowe miejsce i dodajemy do listy
                miejsca.add(new Seat(rzad, nr));
            }
        }
        return miejsca;
    }
}
