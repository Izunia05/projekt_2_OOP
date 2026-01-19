package cinema.app;
import cinema.domain.Seat;
import cinema.domain.Show;
import cinema.domain.StandardAuditorium;
import cinema.service.SeatMapService;
import cinema.service.TicketService;
import cinema.service.ReportService; // Nowy serwis

import java.time.LocalDateTime;
import java.util.List;

import cinema.domain.Auditorium;
import cinema.domain.IMAXAuditorium;
import cinema.domain.PricingStrategy;

public class Main {
    public static void main(String[] args) {
        Auditorium sala1 = new StandardAuditorium("Sala 1", 10, 10);
        Auditorium sala2 = new IMAXAuditorium("Sala IMAX", 15);

       
        sala1.pokazSiatkeMiejsc();
        sala2.pokazSiatkeMiejsc();

        System.out.println();

        SeatMapService mapService = new SeatMapService();
        PricingStrategy pricingStrategy = PricingStrategy.weekendPricing();
        TicketService ticketService = new TicketService(pricingStrategy);
        ReportService reportService = new ReportService();

        System.out.println("=== 1. TWORZENIE SAL (2 sale) ===");

        // Sala 1: Mała, 3 rzędy po 5 miejsc
        StandardAuditorium salaMala = new StandardAuditorium("Sala Kameralna", 3, 5);

        // Sala 2: Duża, 5 rzędów po 10 miejsc
        StandardAuditorium salaDuza = new StandardAuditorium("Sala Kinowa Główna", 5, 10);

        System.out.println("Utworzono: " + salaMala.getNazwa());
        System.out.println("Utworzono: " + salaDuza.getNazwa());


        System.out.println("\n=== 2. TWORZENIE SEANSÓW (2 seanse) ===");

        // Seans 1: Matrix w małej sali (jutro o 18:00)
        List<Seat> miejscaMatrix = mapService.generujMape(salaMala);
        Show seansMatrix = new Show("Matrix", salaMala, LocalDateTime.now().plusDays(1).withHour(18).withMinute(0), miejscaMatrix);

        // Seans 2: Avatar w dużej sali (jutro o 20:00)
        List<Seat> miejscaAvatar = mapService.generujMape(salaDuza);
        Show seansAvatar = new Show("Avatar 2", salaDuza, LocalDateTime.now().plusDays(1).withHour(20).withMinute(0), miejscaAvatar);

        System.out.println("Seans 1: " + seansMatrix.getOpis() + " -> " + seansMatrix.getSala().getNazwa());
        System.out.println("Seans 2: " + seansAvatar.getOpis() + " -> " + seansAvatar.getSala().getNazwa());


        System.out.println("\n=== 3. ROBIENIE REZERWACJI ===");

        // Rezerwujemy bilety na Matrixa
        System.out.println(">> Rezerwacja na Matrixa:");
        ticketService.rezerwujBilet(seansMatrix, 1, 1);
        ticketService.rezerwujBilet(seansMatrix, 1, 2);
        ticketService.rezerwujBilet(seansMatrix, 2, 3);

        // Rezerwujemy bilety na Avatara
        System.out.println(">> Rezerwacja na Avatara:");
        ticketService.rezerwujBilet(seansAvatar, 3, 5);
        ticketService.rezerwujBilet(seansAvatar, 3, 6);
        ticketService.rezerwujBilet(seansAvatar, 5, 10); // Ostatnie miejsce

        // Wyświetlamy stan w konsoli dla pewności
        ticketService.wyswietlStanSali(seansMatrix);
        ticketService.wyswietlStanSali(seansAvatar);


        System.out.println("\n=== 4. EKSPORT RAPORTÓW CSV ===");

        // Zapisujemy raporty do plików w folderze projektu
        reportService.eksportujDoCsv(seansMatrix, "raport_matrix.csv");
        reportService.eksportujDoCsv(seansAvatar, "raport_avatar.csv");

        System.out.println("\n=== KONIEC ===");
        System.out.println("Sprawdź pliki .csv w folderze głównym projektu!");
    }
}
