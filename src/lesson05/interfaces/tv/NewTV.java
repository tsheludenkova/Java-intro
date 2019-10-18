package lesson05.interfaces.tv;

public class NewTV extends BaseTVSet {
    public NewTV(String model, String color) {
        super(model, color);
    }

    public NewTV(String model) {
        super(model);
    }

    @Override
    public void turnOn() {
        System.out.println( getModel() + " using remote control");

    }

    @Override
    public void turnOff() {
        System.out.println( getModel() + " using remote control");

    }

    @Override
    public void switchChannel() {
        System.out.println( getModel() + " using remote control");

    }
}
