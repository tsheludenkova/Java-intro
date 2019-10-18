package lesson05.interfaces.cell;

public class SmartPhone implements Cellable {

    private String phoneName;
    private String name;

    public SmartPhone(String phoneName) {
        this.phoneName = phoneName;
    }

    @Override
    public void insertSimCard() {
        System.out.println ("put nano sim card into " + phoneName );

    }

    @Override
    public void callOnNumber(String number) {
        System.out.print ( "Using fingerprint ");

    }

    @Override
    public void saveNumber(String number) {
        System.out.println ( number +" in the Google account ");

    }

    @Override
    public void takeCall() {
        System.out.println ( "swiping up the screen");

    }

    @Override
    public void blockPhone() {
        System.out.println ( " using fingerprint ");

    }

    @Override
    public void unblockPhone() {
        System.out.println ( " using fingerprint ");

    }

    @Override
    public String getPhoneName() {
        return phoneName;
    }


    private String getHumanName() {
        return getHumanName();
    }



}
