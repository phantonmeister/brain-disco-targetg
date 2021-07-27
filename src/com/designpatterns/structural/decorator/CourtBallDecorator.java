package designpatterns.structural.decorator;

public class CourtBallDecorator extends CourtReservation{
    private CourtReservation reservation;

    public CourtBallDecorator(CourtReservation reservation) {
        this.reservation = reservation;
    }

    public void setReservation(CourtReservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public void reserve() {
        reservation.reserve();
        System.out.println("Adding coaching and ball package. Total cost is " +this.getCost());
    }

    @Override
    public int getCost() {
        return 100+reservation.getCost();
    }
}
