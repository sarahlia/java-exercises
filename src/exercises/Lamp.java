package exercises;

public class Lamp {

    private String style;
    private boolean battery;
    private int wattage;

    public Lamp(String style, boolean battery, int wattage) {
        this.style = style;
        this.battery = battery;
        this.wattage = wattage;
    }

    public void turnOn() {
        System.out.println("Lamp -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getWattage() {
        return wattage;
    }
}
