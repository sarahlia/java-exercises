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

        Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);

        System.out.println("Printing theater.seat");
        printList(theater.seats);

        TheaterRevisited.Seat minSeat = Collections.min(seatCopy);
        TheaterRevisited.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);
    }

    public static void printList(List<TheaterRevisited.Seat> list) {
        for(TheaterRevisited.Seat seat:list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("===========================================================================");
    }

    public static void sortList(List<? extends TheaterRevisited.Seat> list) {
        //nested for loop(slower):
        for(int i=0; i<list.size()-1; i++) {
            for(int j=i+1; j<list.size(); j++) { //the inner loop is checking fewer and fewer elements each time around.
                if(list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
