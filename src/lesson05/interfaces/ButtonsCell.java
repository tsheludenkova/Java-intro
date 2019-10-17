package lesson05.interfaces;

public class ButtonsCell implements Cellable {

    private String phoneName;


    public ButtonsCell(String phoneName) {
        this.phoneName = phoneName;
    }


    @Override
    public void insertSimCard() {
        System.out.println ("put usual sim card into" + phoneName );

    }

    @Override
    public void callOnNumber(String number) {
        System.out.print ( "Using buttons ");

    }

    @Override
    public void saveNumber(String number) {
        System.out.println ( number +" in the Sim card");

    }

    @Override
    public void takeCall() {
        System.out.println ( "using button green phone");

    }

    @Override
    public void blockPhone() {
        System.out.println ( " using button * ");

    }

    @Override
    public void unblockPhone() {
        System.out.println ( " using button * ");

    }

    @Override
    public String getPhoneName() {
        return phoneName;
    }




}
