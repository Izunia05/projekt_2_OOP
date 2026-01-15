package cinema.domain;

public class StandardAuditorium extends Auditorium{
    public StandardAuditorium(String nazwa, int liczbaRzedow) {
        super(nazwa, liczbaRzedow, "klasyczny");
    }

    @Override
    public void pokazSiatkeMiejsc() {
        System.out.println("Siatka miejsc w sali standardowej: " + getLiczbaRzedow() + " rzędów.");
    }
}
