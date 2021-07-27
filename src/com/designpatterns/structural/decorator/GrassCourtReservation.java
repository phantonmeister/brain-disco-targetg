package designpatterns.structural.decorator;

public class GrassCourtReservation extends CourtReservation {
    @Override
    public void reserve() {
        System.out.println("Reserving Grass Court.");
    }

    @Override
    public int getCost() {
        return 75;
    }
}
