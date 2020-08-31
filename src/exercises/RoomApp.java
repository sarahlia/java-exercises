package exercises;

public class RoomApp {

    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, "beige");
        Bed bed = new Bed("Bunk", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Night", false, 75);

        Bedroom bedroom = new Bedroom("Teen bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
