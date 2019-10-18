package lesson05.interfaces_part2;

public class Program {
    public static void main(String[] args) {
        TVUser user1 = new TVUser("Bob", "Ivanovich");
        TVUser user2 = new TVUser("Radion", "Petrovich");
        OldTV philips = new OldTV("Philips", "silver");
        NewTV samsung = new NewTV("Samsung", "black");
        NewTV lg = new NewTV("LG");

        user1.takeVT(philips);
        user1.userTurnOnTV();
        user1.userSwitchChannel();
        user1.userTurnOffTV();

        user1.takeVT(lg);
        user1.userTurnOnTV();
        user1.userSwitchChannel();
        user1.userTurnOffTV();




        user2.takeVT(samsung);
        user2.userTurnOnTV();
        user2.userSwitchChannel();
        user2.userTurnOnTV();

    }
}
