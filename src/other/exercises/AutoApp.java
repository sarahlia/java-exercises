package other.exercises;

class Auto {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Auto(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return this.name;
    }

    public int getCylinders() {
        return this.cylinders;
    }

    public String startEngine() {
        return "The auto's engine is started...";
    }

    public String accelerate() {
        return "The auto is speeding up";
    }

    public void brake() {
        System.out.println("The auto is braking");
    }
}

class BMW extends Auto {

    public BMW() {
        super("unknown model BMW", 3);
    }

    //no methods here.
}

class Ferrari extends Auto {

    public Ferrari() {
        super("LaFerrari", 12);
    }

    @Override
    public String startEngine() {
        return "The shiny " + getClass().getSimpleName() + " is revving its engine";
    }

    @Override
    public String accelerate() {
        return "The " + getClass().getSimpleName() + " is going up to 5th gear";
    }

    @Override
    public void brake() {
        System.out.println("The red Prancing Pony is coming to a stop");
    }
}

class Fiat extends Auto {

    public Fiat() {
        super("Fiat Spider", 4);
    }

    @Override
    public String startEngine() {
        return "The little but sleek " + getClass().getSimpleName() + " is starting its engine";
    }

    @Override
    public String accelerate() {
        return "The " + getClass().getSimpleName() + " is speeding up";
    }

    @Override
    public void brake() {
        System.out.println("The Fiat Spider is coming to a halt then lowers its top.");
    }
}

public class AutoApp {

    public static void main(String[] args) {

            Auto auto = new Auto("standard", 8);
            System.out.println(auto.startEngine());
            System.out.println(auto.accelerate());
            auto.brake();

            //Polymorphism
            Auto ferrari = new Ferrari();
            Auto bmw = new BMW();
            Auto fiat = new Fiat();
            System.out.printf("Car #%d is %s and it has a %d cylinder engine. %s. %s. \n", 1, ferrari.getName(), ferrari.getCylinders(), ferrari.startEngine(), ferrari.accelerate());
            System.out.printf("Car #%d is %s and it has a %d cylinder engine. %s. %s. \n", 2, bmw.getName(), bmw.getCylinders(), bmw.startEngine(), bmw.accelerate());
            System.out.printf("Car #%d is %s and it has a %d cylinder engine. %s. %s. \n", 3, fiat.getName(), fiat.getCylinders(), fiat.startEngine(), fiat.accelerate());

    }
}
