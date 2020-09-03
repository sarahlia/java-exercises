package exercises;

class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if(length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.getArea() = " + rectangle.getArea());

        Rectangle r2 = new Rectangle(-1, 2);
        System.out.println("r2.getWidth() = " + r2.getWidth());
        System.out.println("r2.getArea() = " + r2.getArea());

        Cuboid cuboid = new Cuboid(3, 5, 9);
        System.out.println("cuboid.getArea() = " + cuboid.getArea());
        System.out.println("cuboid.getVolume() = " + cuboid.getVolume());

        Cuboid c2 = new Cuboid(1, 3, -2);
        System.out.println("c2.getWidth() = " + c2.getWidth());
        System.out.println("c2.getLength() = " + c2.getLength());
        System.out.println("c2.getHeight() = " + c2.getHeight());
        System.out.println("c2.getVolume() = " + c2.getVolume());
    }

}

class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);

        if(height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return getArea() * this.height;
    }

}


