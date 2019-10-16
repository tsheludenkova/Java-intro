package lesson05.interfaces;

public class Human {
    protected String name;
    protected String surname;
    protected int age;
    private  Cellable cell;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }



    public void takeCell(Cellable cell) {
        this.cell = cell;

        System.out.println(name + " take a phone " + getPhoneModel() );
    }


    public String getName() {
        return name;
    }

    public Human setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Human setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Human setAge(int age) {
        this.age = age;
        return this;
    }

    public void call(String number) {
        cell.callOnNumber(number);
        System.out.println(name + " is calling to " + number );
    }

    public void takeCall() {
        System.out.print(getName() + " is taking call ");
        cell.takeCall();
    }

    public void saveNo(String number) {
        System.out.print(getName() + " is saving number ");
        cell.saveNumber(number);
    }

    public void insertSimCard() {
        System.out.print(getName() + " going to ");
        cell.insertSimCard();
    }

    public void blockPhone() {
        System.out.print(getName() + " is blocking " +getPhoneModel());
        cell.blockPhone();
    }

    public void unblockPhone() {
        System.out.print(getName() + " is unblocking " +getPhoneModel());
        cell.unblockPhone();
    }

    public String getPhoneModel(){
        return cell.getPhoneName();
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        if (name != null ? !name.equals(human.name) : human.name != null) return false;
        if (surname != null ? !surname.equals(human.surname) : human.surname != null) return false;
        return cell != null ? cell.equals(human.cell) : human.cell == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (cell != null ? cell.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", cell=" + cell +
                '}';
    }
}
