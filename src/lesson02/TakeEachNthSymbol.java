package lesson02;

public class TakeEachNthSymbol {

    public static String string;
    public static int n;


    public static void main(String[] args) {
        eachNth("Lorem Ipsum is simply", 2);
        System.out.print("\n");
        eachNth("Lorem Ipsum is simply", 3);
        System.out.print("\n");
        eachNth("Lorem Ipsum is simply", 5);
    }

    public  static void eachNth(String string, int n) {

        char[] var = string.toCharArray();
        for (int i = 0; i< var.length; i = i+n)
            System.out.print(var[i]);
    }
}
