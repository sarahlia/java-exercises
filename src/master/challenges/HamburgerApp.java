package master.challenges;

public class HamburgerApp {

    public static void main(String[] args) {
        Hamburger h1 = new Hamburger("Bill", "white", "beef", 7.50);
        System.out.println("h1.basePrice() = " + h1.basePrice());
        h1.addAddition1("lettuce", 1.25);
//        h1.grandTotal();
        h1.addAddition2("tomato", 0.55);
        h1.addAddition3("carrot", 0.50);
        h1.addAddition4("olive", 0.90);
        h1.grandTotal();
    }
}
