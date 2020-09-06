package master.challenges;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "wheat", "sausage & bacon", 8.00);
        super.addAddition1("chips", 2.80);
        super.addAddition2("drink", 1.99);
    }

    @Override
    public void addAddition1(String name, double price) {
        System.out.println("***Cannot add additional items to a Deluxe Burger***");
    }

    @Override
    public void addAddition2(String name, double price) {
        System.out.println("***Cannot add additional items to a Deluxe Burger***");
    }

    @Override
    public void addAddition3(String name, double price) {
        System.out.println("***Cannot add additional items to a Deluxe Burger***");
    }

    @Override
    public void addAddition4(String name, double price) {
        System.out.println("***Cannot add additional items to a Deluxe Burger***");
    }
}
