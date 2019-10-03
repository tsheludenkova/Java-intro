package lesson02;

public class Person {
    String firstName;
    String secondName;
    int age;
    private static int count = 0;


    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
      // count++;


    }

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void doSmth(){
        System.out.printf("%s %s does something...\n", firstName, secondName);
    }

    static {
        System.out.println("First class loading...");
    }


    public static int getCount(){
        return count;
    }

    {
        System.out.println("Class has " + ++count + " instances");
    }

    @Override
    public String toString() {
        return "{" +
                "firstName = '" + firstName + '\'' +
                ", secondName = '" + secondName + '\'' +
                ", age = " + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        return secondName != null ? secondName.equals(person.secondName) : person.secondName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }



    public static void main(String[] args) {
        Person p1 = new Person("Tom", "Kruz", 57);
        Person p2 = new Person("Tom", "Kruz", 57);
        Person p3 = new Person("Gorge", "Smith");
        Person p4 = p1;

        System.out.println("Count of Person = " + Person.getCount());
        System.out.printf("p1 == p2 %s %n", p1 == p2);
        System.out.printf("p1 == p3 %s %n" , p1 == p3);
        System.out.printf("p1 == p4 %s %n" , p1 == p4);
        System.out.println("p1.equals(p2) : " + p1.equals(p2));
        System.out.println("p1.equals(p3) : " + p1.equals(p3));
        System.out.println("p1.equals(p4) : " + p1.equals(p4));


        System.out.println("Person1: "+ p1.toString() + " hashCode: " + p1.hashCode());
        System.out.println("Person2: "+ p2.toString() + " hashCode: " + p2.hashCode());
        System.out.println("Person3: "+ p3.toString() + " hashCode: " + p3.hashCode());
        System.out.println("Person4: "+ p4.toString() + " hashCode: " + p4.hashCode());





    }

}
