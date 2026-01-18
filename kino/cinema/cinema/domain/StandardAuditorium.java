package cinema.domain;

public class StandardAuditorium extends Auditorium{
    public StandardAuditorium(String nazwa, int liczbaRzedow) {
        super(nazwa, liczbaRzedow, "klasyczny");
    }

    private int miejscaWRzedzie;

    public StandardAuditorium(String nazwa, int liczbaRzedow, int miejscaWRzedzie) {
        super(nazwa, liczbaRzedow, "klasyczny");
        this.miejscaWRzedzie = miejscaWRzedzie;
    }

    public int getMiejscaWRzedzie() {
        return miejscaWRzedzie;
    }

    @Override
    public void pokazSiatkeMiejsc() {
        System.out.println("Siatka miejsc w sali standardowej: " + getLiczbaRzedow() + " rzędów, po " + miejscaWRzedzie + " miejsc.");
    }

    @Override
    public double getBasePrice() {
        return 20.0; // Przykładowa podstawowa cena biletu dla sali standardowej
    }
}
