package cinema.domain;

public class Seat implements Bookable {

    private final int rzad;
    private final int miejsce;
    private boolean zajete;

    public Seat(int rzad, int miejsce) {
        if (rzad <= 0 || miejsce <= 0) {
            throw new IllegalArgumentException("Rząd i miejsce muszą być większe od zera.");
        }
        this.rzad = rzad;
        this.miejsce = miejsce;
        this.zajete = false;
    }

    @Override
    public void book() {
        if (zajete) {
            throw new IllegalStateException("Miejsce jest już zajęte.");
        }
        zajete = true;
    }

    @Override
    public void cancel() {
        if (!zajete) {
            throw new IllegalStateException("Miejsce nie było zarezerwowane.");
        }
        zajete = false;
    }

    @Override
    public boolean isAvailable() {
        return !zajete;
    }
}
