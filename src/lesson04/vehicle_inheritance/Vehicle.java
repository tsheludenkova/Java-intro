package lesson04.vehicle_inheritance;

public abstract class Vehicle {
    protected String Color;
    protected String Model;
    protected boolean Condition;
    protected int Speed;

    public Vehicle(String color, String model, boolean condition, int speed) {
        Color = color;
        Model = model;
        Condition = condition;
        Speed = speed;
    }

    public void startEngine() {
        System.out.printf("%s %s %s is starting engine %n", getColor() , getType(), getModel());
    }

    public void go() {
        System.out.printf("%s %s %s is going with %s km/h %n", getColor() , getType(),getModel(), getSpeed());
    }

    public void stop() {
        System.out.printf("%s %s %s is stopping %n", getColor() , getType(), getModel());
    }



    protected abstract String getType();



    public String getColor() {
        return Color;
    }

    public Vehicle setColor(String color) {
        Color = color;
        return this;
    }

    public String getModel() {
        return Model;
    }

    public Vehicle setModel(String model) {
        Model = model;
        return this;
    }

    public boolean isCondition() {
        return Condition;
    }

    public Vehicle setCondition(boolean condition) {
        Condition = condition;
        return this;
    }

    public int getSpeed() {
        return Speed;
    }

    public Vehicle setSpeed(int speed) {
        Speed = speed;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (Condition != vehicle.Condition) return false;
        if (Speed != vehicle.Speed) return false;
        if (Color != null ? !Color.equals(vehicle.Color) : vehicle.Color != null) return false;
        return Model != null ? Model.equals(vehicle.Model) : vehicle.Model == null;
    }

    @Override
    public int hashCode() {
        int result = Color != null ? Color.hashCode() : 0;
        result = 31 * result + (Model != null ? Model.hashCode() : 0);
        result = 31 * result + (Condition ? 1 : 0);
        result = 31 * result + Speed;
        return result;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Color='" + Color + '\'' +
                ", Model='" + Model + '\'' +
                ", Condition=" + Condition +
                ", Mileage=" + Speed +
                '}';
    }
}
