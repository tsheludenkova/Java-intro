package lesson05.interfaces_part2;

public class OldTV extends BaseTVSet {
    public OldTV(String model, String color) {
        super(model, color);
    }

    @Override
    public void turnOn() {
        System.out.println(getModel() + " by pushing on the turn on button");

    }

    @Override
    public void turnOff() {
        System.out.println(getModel() + " by pushing on the turn off button");

    }

    @Override
    public void switchChannel() {
        System.out.println(getModel() + " by pushing on the appropriate channel button");

    }
}