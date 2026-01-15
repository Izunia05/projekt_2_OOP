package cinema.app;

import cinema.domain.Auditorium;
import cinema.domain.StandardAuditorium;
import cinema.domain.IMAXAuditorium;

public class Main {
    public static void main(String[] args) {
        Auditorium sala1 = new StandardAuditorium("Sala 1", 10);
        Auditorium sala2 = new IMAXAuditorium("Sala IMAX", 15);

        sala1.pokazSiatkeMiejsc();
        sala2.pokazSiatkeMiejsc();
    }
}
