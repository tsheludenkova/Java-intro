package lesson04.vehicle_inheritance;

public class Program {
    public static void main(String[] args) {
        PassengerCar car = new PassengerCar("White", "Ford", true, 100);
        Truck track = new Truck("Gray", "KAMAZ", false, 80);
        car.startEngine();
        track.startEngine();
        car.go();
        track.go();
        car.stop();
        track.stop();
    }
}
