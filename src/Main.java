public class Main {

    public static void main(String[] args) {
//        Theater theater = new Theater("Rialto", 8, 12);
//        //just to print out all the seats
//        theater.getSeats();
//
//        if(theater.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken.");
//        }
//
//        theater.reserveSeat("A13");
//

        TheaterRevisited tr = new TheaterRevisited("Apollo", 20, 13);
//        tr.getSeats();
        if(tr.reserveSeat("B03")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken.");
        }

        if(tr.reserveSeat("B03")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken.");
        }

        tr.reserveSeat("X10");
    }
}
