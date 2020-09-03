package master.challenges;

public class Hamburger {

    private String name;
    private String breadType;
    private String meat;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;


    public Hamburger(String name, String breadType, String meat, double price) {
        this.name = name;
        this.breadType = breadType;
        this.meat = meat;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBreadType() {
        return breadType;
    }

    public String getMeat() {
        return meat;
    }

    public double basePrice() {
        return this.price;
    }

    public void addAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public void grandTotal() {

        double hamburgerPrice = basePrice();

        System.out.printf("The %s Burger with %s on %s roll is $%.2f \n", this.name, this.meat, this.breadType, basePrice());

        if(addition1Price != 0) {
            hamburgerPrice += addition1Price;
            System.out.printf("Added %s for an additional $%.2f \n", addition1Name, addition1Price);
        }

        if(addition2Price != 0) {
            hamburgerPrice += addition2Price;
            System.out.printf("Added %s for an additional $%.2f \n", addition2Name, addition2Price);
        }

        if(addition3Price != 0) {
            hamburgerPrice += addition3Price;
            System.out.printf("Added %s for an additional $%.2f \n", addition3Name, addition3Price);
        }

        if(addition4Price != 0) {
            hamburgerPrice += addition4Price;
            System.out.printf("Added %s for an additional $%.2f \n", addition4Name, addition4Price);
        }

        System.out.printf("Your grand total is $%.2f \n", hamburgerPrice);
//        return hamburgerPrice;
    }


}
