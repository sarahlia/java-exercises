package exercises;

public class VehicleApp {

    public static void main(String[] args) {
        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        System.out.println("outlander.getCurrentDirection() = " + outlander.getCurrentDirection());
        outlander.steer(40);
        System.out.println("outlander.getCurrentDirection() = " + outlander.getCurrentDirection());
        outlander.accelerate(-42);
    }
}
