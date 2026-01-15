package cinema.domain;

public class IMAXAuditorium extends Auditorium {

    public IMAXAuditorium(String nazwa, int liczbaRzedow) {
        super(nazwa, liczbaRzedow, "stadium");
    }

    @Override
    public void pokazSiatkeMiejsc() {
        System.out.println("Siatka miejsc w sali IMAX: " + getLiczbaRzedow() + " rzędów w układzie stadium.");
    }
}
