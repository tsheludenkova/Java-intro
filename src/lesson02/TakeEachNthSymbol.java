package lesson02;

public class TakeEachNthSymbol {

    public static String string;
    public static int n;


    public static void main(String[] args) {

        everyNth("Lorem Ipsum is simply", 2);
        System.out.print("\n");
        everyNth("Lorem Ipsum is simply", 3);
        System.out.print("\n");
        everyNth("Lorem Ipsum is simply", 5);
    }


    public  static void everyNth(String string, int n) {
        for (int i = 0; i < string.length(); i = i + n) {
            char c = string.charAt(i);
            System.out.print(c);
        }
    }


}
