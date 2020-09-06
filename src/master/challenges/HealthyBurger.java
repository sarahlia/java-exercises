package master.challenges;

public class HealthyBurger extends Hamburger {

    private String topping1Name;
    private double topping1Price;

    private String topping2Name;
    private double topping2Price;

    public HealthyBurger(String meat, double price) {
        super("Vegan", "brown rye", meat, price);
    }

    public String getTopping1Name() {
        return topping1Name;
    }

    public double getTopping1Price() {
        return topping1Price;
    }

    public String getTopping2Name() {
        return topping2Name;
    }

    public double getTopping2Price() {
        return topping2Price;
    }

    public void addTopping1(String name, double price) {
        this.topping1Name = name;
        this.topping1Price = price;
    }

    public void addTopping2(String name, double price) {
        this.topping2Name = name;
        this.topping2Price = price;
    }

    @Override
    public double grandTotal() {
        double hamburgerPrice = super.grandTotal();
        if(topping1Name != null) {
            hamburgerPrice += this.topping1Price;
            System.out.printf("Added %s for an additional $%.2f \n", topping1Name, topping1Price);
        }

        if (topping2Name != null) {
            hamburgerPrice += this.topping2Price;
            System.out.printf("Added %s for an additional $%.2f \n", topping2Name, topping2Price);
        }

        System.out.printf("Your grand total is $%.2f \n", hamburgerPrice);
        return hamburgerPrice;
    }

    @Override
    public void burgerMessage() {
        System.out.println("This is the Healthy Burger! \n");
    }

}
