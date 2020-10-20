import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TheaterRevisited theater = new TheaterRevisited("Rialto", 8, 12);
        List<TheaterRevisited.Seat> seatCopy = new ArrayList<>(theater.seats); //seatCopy is a shallow copy
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if(theater.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved.");
        }

        Collections.reverse(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);

        System.out.println("Printing theater.seat");
        printList(theater.seats);

        TheaterRevisited.Seat minSeat = Collections.min(seatCopy);
        TheaterRevisited.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());
    }

    public static void printList(List<TheaterRevisited.Seat> list) {
        for(TheaterRevisited.Seat seat:list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("===========================================================================");
    }
}
