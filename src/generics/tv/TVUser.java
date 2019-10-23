package generics.tv;

public class TVUser <T extends TV >{
    private String name;
    private String surname;
    private T tv;

    public TVUser(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void takeVT(T tv){
        this.tv = tv;
        System.out.println(name + " has came to room with "+ tv.getColor() + " "+ tv.getModel() + " TV");
    }

    public void userTurnOnTV () {
        System.out.printf(name + " has turned on ");
        tv.turnOn();

    }

    public void userTurnOffTV () {
        System.out.printf(name + " has turned off ");
        tv.turnOff();

    }

    public void userSwitchChannel () {

        System.out.printf(name + " has switched the channel ");
        tv.switchChannel();

    }


    public String getName() {
        return name;
    }

    public TVUser setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public TVUser setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public TV getTv() {
        return tv;
    }

    public TVUser setTv(T tv) {
        this.tv = tv;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TVUser tvUser = (TVUser) o;

        if (name != null ? !name.equals(tvUser.name) : tvUser.name != null) return false;
        if (surname != null ? !surname.equals(tvUser.surname) : tvUser.surname != null) return false;
        return tv != null ? tv.equals(tvUser.tv) : tvUser.tv == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (tv != null ? tv.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TVUser{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", tv=" + tv +
                '}';
    }
}
