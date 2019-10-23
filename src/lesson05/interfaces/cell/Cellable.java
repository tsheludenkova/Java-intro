package lesson05.interfaces.cell;

public interface Cellable extends generics.cell.Cellable {

    void insertSimCard();

    void callOnNumber(String number);

    void saveNumber(String number);

    void takeCall();

    void blockPhone();

    void unblockPhone();

    String getPhoneName();

}
