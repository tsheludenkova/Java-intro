package lesson05.interfaces_part2;

public abstract class BaseTVSet implements TV {

    protected String model;
    protected String color;

    public BaseTVSet(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseTVSet baseTVSet = (BaseTVSet) o;

        if (model != null ? !model.equals(baseTVSet.model) : baseTVSet.model != null) return false;
        return color != null ? color.equals(baseTVSet.color) : baseTVSet.color == null;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BaseTVSet{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
