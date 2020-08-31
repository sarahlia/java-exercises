package exercises;

public class CircleApp {

    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("circle.getRadius() = " + circle.getRadius());
        System.out.println("circle.getArea() = " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.getRadius() = " + cylinder.getRadius());
        System.out.println("cylinder.getHeight() = " + cylinder.getHeight());
        System.out.println("cylinder.getVolume() = " + cylinder.getVolume());
    }
}
