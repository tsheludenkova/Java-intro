package lesson05.interfaces;

public class Program {
    public static void main(String[] args) {
        Human oldman = new Human("Ivan", "Ivanovich", 60);
        Human youngman = new Human("Pavlo", "Pavlovich", 25);
        SmartPhone iphone = new SmartPhone("Iphone 7");
        ButtonsCell nokiaPhone = new ButtonsCell(" Nokia 105");

        oldman.takeCell(nokiaPhone);
        oldman.insertSimCard();
        oldman.call("+380645465655");
        oldman.takeCall();
        oldman.saveNo("+38065676543");
        oldman.blockPhone();
        oldman.unblockPhone();

        youngman.takeCell(iphone);
        youngman.insertSimCard();
        youngman.call("+380937867652");
        youngman.takeCall();
        youngman.saveNo("+80639876750");
        youngman.blockPhone();
        youngman.unblockPhone();

    }
}
