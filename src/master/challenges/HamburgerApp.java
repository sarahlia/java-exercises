package master.challenges;

public class HamburgerApp {

    public static void main(String[] args) {
        Hamburger h1 = new Hamburger("Bill", "white", "beef", 7.50);
        System.out.println("h1.basePrice() = " + h1.basePrice());
        h1.addAddition1("lettuce", 1.25);
        h1.addAddition2("tomato", 0.55);
        h1.addAddition3("carrot", 0.50);
        h1.addAddition4("olive", 0.90);
        h1.grandTotal();
        h1.burgerMessage();

        Hamburger h2 = new HealthyBurger("facon", 6.00);
        System.out.println("h2.getName() = " + h2.getName());
        System.out.println("h2.getMeat() = " + h2.getMeat());
        System.out.println("h2.getBreadType() = " + h2.getBreadType());
        h2.burgerMessage();

        HealthyBurger h3 = new HealthyBurger("tofurkey", 7.15);
        h3.addAddition1("tomato", 0.55);
        h3.addTopping1("kale", 0.90);
        h3.grandTotal();
        h3.burgerMessage();

        DeluxeBurger deluxe = new DeluxeBurger();
        deluxe.addAddition3("cheese", 2.00);
        deluxe.grandTotal();
        deluxe.burgerMessage();
    }
}
