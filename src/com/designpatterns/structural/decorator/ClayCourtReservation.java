package designpatterns.structural.decorator;

public class ClayCourtReservation extends CourtReservation {
    @Override
    public void reserve() {
        System.out.println("Reserving Clay Court for price $50.");
    }

    @Override
    public int getCost() {
        return 50;
    }
}
