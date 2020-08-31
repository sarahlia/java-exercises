package exercises;

public class PrinterApp {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("initial page count for printer = " + printer.getPagesPrinted());
        int pagesPrintedInDuplex = printer.printPages(4); // 2 pages front & back
        System.out.println("Pages printed was " + pagesPrintedInDuplex + ". New total print count for printer = " + printer.getPagesPrinted());
        pagesPrintedInDuplex = printer.printPages(3); // 2 pages front & back + 1 page front
        System.out.println("Pages printed was " + pagesPrintedInDuplex + ". New total print count for printer = " + printer.getPagesPrinted());
        printer.addToner(30);
        System.out.println("New toner level = " + printer.getTonerLevel());
        printer.addToner(20);
        System.out.println("New toner level = " + printer.getTonerLevel());

//        Printer anotherPrinter = new Printer(60, false);
//        System.out.println("initial page count for anotherPrinter = " + anotherPrinter.getPagesPrinted());
//        int pagesPrinted = anotherPrinter.printPages(4);
//        System.out.println("Pages printed was " + pagesPrinted + ". New total print count for printer = " + anotherPrinter.getPagesPrinted());
//        pagesPrinted = anotherPrinter.printPages(2);
//        System.out.println("Pages printed was " + pagesPrinted + ". New total print count for printer = " + anotherPrinter.getPagesPrinted());
//
    }
}
