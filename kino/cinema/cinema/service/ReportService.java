package cinema.service;

import cinema.domain.Seat;
import cinema.domain.Show;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReportService {

    // Ta metoda bierze seans i zapisuje go do pliku o podanej nazwie
    public void eksportujDoCsv(Show seans, String nazwaPliku) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nazwaPliku))) {

            // 1. Nagłówek pliku CSV
            writer.write("Film,Sala,Data,Rzad,Miejsce,Status\n");

            // 2. Pętla po wszystkich miejscach
            for (Seat s : seans.getMiejsca()) {
                String status = s.isAvailable() ? "WOLNE" : "SPRZEDANE";

                // Budujemy linię: np. "Matrix,Sala 1,2024-05-20,1,5,SPRZEDANE"
                String linia = String.format("%s,%s,%s,%d,%d,%s\n",
                        seans.getFilm(),
                        seans.getSala().getNazwa(),
                        seans.getOpis(), // Tu uproszczony opis daty
                        s.getRzad(),
                        s.getMiejsce(),
                        status
                );

                writer.write(linia);
            }

            System.out.println("SUKCES: Wygenerowano raport CSV: " + nazwaPliku);

        } catch (IOException e) {
            System.out.println("BŁĄD zapisu pliku: " + e.getMessage());
        }
    }
}