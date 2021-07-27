package designpatterns.structural.decorator;

public class DecoratorMain {

    public static void main(String... args){

        CourtReservation reservation = new ClayCourtReservation();
        System.out.println("============ Basic reservation.===========");
        reservation.reserve();
        System.out.println("============ Basic reservation.===========");

        reservation = new CourtCoachingDecorator(reservation);
        System.out.println("============Reservation with coaching.===========");
        reservation.reserve();
        System.out.println("============Reservation with coaching.===========");

        reservation = new CourtBallDecorator(reservation);
        System.out.println("============Reservation with balls.===========");
        reservation.reserve();
        System.out.println("============Reservation with balls.===========");

    }
}
