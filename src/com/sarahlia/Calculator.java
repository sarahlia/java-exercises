package com.sarahlia;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return this.floor.getArea() * this.carpet.getCost();
    }

    public static void main(String[] args) {
        Floor fl = new Floor(2.75, 4.0); //11 m^2
        Carpet carp = new Carpet(3.50);

        Calculator calc = new Calculator(fl, carp);
        System.out.println("total = " + calc.getTotalCost()); //38.50

        carp = new Carpet(1.5);
        fl = new Floor(5.4, 4.5); //24.3 m^2
        calc = new Calculator(fl, carp);
        System.out.println("total = " + calc.getTotalCost()); //36.45
    }
}
