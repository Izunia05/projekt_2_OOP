package cinema.domain;

public abstract class Auditorium {

    private int miejscaWRzedzie;

    private String nazwa;
    private int liczbaRzedow;
    private String uklad;

    public Auditorium(String nazwa, int liczbaRzedow, String uklad) {
        this.nazwa = nazwa;
        this.liczbaRzedow = liczbaRzedow;
        this.uklad = uklad;
    }

    public int getMiejscaWRzedzie() {
        return miejscaWRzedzie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getLiczbaRzedow() {
        return liczbaRzedow;
    }

    public String getUklad() {
        return uklad;
    }

    public abstract void pokazSiatkeMiejsc();
}



