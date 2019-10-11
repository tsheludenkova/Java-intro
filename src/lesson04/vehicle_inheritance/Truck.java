package lesson04.vehicle_inheritance;

public class Truck extends Vehicle {
    public Truck(String color, String model, boolean condition, int speed) {
        super(color, model, condition, speed);
    }

    @Override
    protected String getType() {
        return "track";
    }

    @Override
    public Vehicle setColor(String color) {
        return super.setColor(color);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }
}
