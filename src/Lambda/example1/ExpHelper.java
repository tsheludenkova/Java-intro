package Lambda;

public class ExpHelper {
    public static boolean isEven(int i) {
        return i%2 == 0;
    }

    public static boolean isOdd (int i) {
        return !isEven(i);
    }
}
