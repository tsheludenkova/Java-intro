package lesson02;

public class TakeEachNthSymbol {

    public static String string;
    public static int n;


    public static void main(String[] args) {

        String a = everyNth("Lorem Ipsum is simply", 2);
        System.out.println(a);
        System.out.println(everyNth("Lorem Ipsum is simply", 3));
        System.out.println(everyNth("Lorem Ipsum is simply", 5));
    }


    public static String everyNth(String string, int n) {
        String out = "";
        for (int i = 0; i < string.length(); i = i + n) {
            char c = string.charAt(i);
            out += c;
        }
            return out;
    }



}
