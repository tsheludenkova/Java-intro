package lesson04.vehicle_inheritance;

public class PassengerCar extends Vehicle {

    public PassengerCar(String color, String model, boolean condition, int speed)
    { super(color, model, condition, speed); }

    @Override
    protected String getType() {
        return "passenger car";
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
