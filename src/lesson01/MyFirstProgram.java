package lesson01;

public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("----------from Byte conversion-----------------");
        byteToShort();
        byteToChar();
        byteToInt();
        byteToLong();
        byteToFloat();
        byteToDouble();
        //     byteToBoolean();
        System.out.println("----------from short conversion-----------------");
        shortToByte();
        shortToChar();
        shortToInt();
        shortToLong();
        shortToFloat();
        shortToDouble();
        System.out.println("----------from char conversion-----------------");
        charToByte();
        charToShort();
        charToInt();
        charToLong();
        charToFloat();
        charToDouble();
        System.out.println("----------from int conversion-----------------");
        intToByte();
        intToShort();
        intToChar();
        intToLong();
        intToFloat();
        intToDouble();
        System.out.println("----------from long conversion-----------------");
        longToByte();
        longToShort();
        longToChar();
        longToInt();
        longToFloat();
        longToDouble();
        System.out.println("----------from float conversion-----------------");
        floatToByte();
        floatToShort();
        floatToChar();
        floatToInt();
        floatToLong();
        floatToDouble();
        System.out.println("----------from double conversion-----------------");
        doubleToByte();
        doubleToShort();
        doubleToChar();
        doubleToInt();
        doubleToLong();
        doubleToFloat();

    }

    public static void byteToShort() {
        byte a = 3;
        short b = a;
        System.out.printf("byteToShort %d \n", b);
    }

    public static void byteToChar() {
        byte a = 18;
        char b = (char) a;

        System.out.printf("byteToChar %s \n", b);
    }

    public static void byteToInt() {
        byte a = 7;
        int b = a;
        System.out.printf("byteToInt %d \n", b);

    }

    public static void byteToLong() {
        byte a = 24;
        long b = a;
        System.out.printf("byteToLong %d \n", b);

    }

    public static void byteToFloat() {
        byte a = 100;
        float b = a;
        System.out.printf("byteToFloat %f \n", b);
    }

    public static void byteToDouble() {
        byte a = 115;
        double b = a;
        System.out.printf("byteToDouble %f \n", b);
    }

    public static void byteToBoolean() {

    }

    public static void shortToByte() {
        short a = 200;
        byte b = (byte) a;
        System.out.printf("shortToByte %d \n", b);
    }
    public static void shortToChar() {
        short a = 200;
        char b = (char) a;
        System.out.printf("shortToChar %s \n", b);
    }
    public static void shortToInt() {
        short a = 300;
        int b = a;
        System.out.printf("shortToInt %d \n", b);
    }
    public static void shortToLong() {
        short a = 400;
        long b = a;
        System.out.printf("shortToLong %d \n", b);
    }
    public static void shortToFloat() {
        short a = 700;
        float b = a;
        System.out.printf("shortToFloat %f \n", b);
    }
    public static void shortToDouble() {
        short a = 800;
        double b = a;
        System.out.printf("shortToDouble %f \n", b);
    }
    public static void charToByte() {
        char a = 60;
        byte b = (byte) a;
        System.out.printf("charToByte %d \n", b);
    }
    public static void charToShort() {
        char a = 'B';
        short b = (short) a;
        System.out.printf("charToShort %d \n", b);
    }
    public static void charToInt() {
        char a = 'D';
        int b = (int) a;
        System.out.printf("charToInt %d \n", b);
    }
    public static void charToLong() {
        char a = 'F';
        long b = (long) a;
        System.out.printf("charToLong %d \n", b);
    }
    public static void charToFloat() {
        char a = 'I';
        float b = (float) a;
        System.out.printf("charToFloat %f \n", b);
    }
    public static void charToDouble() {
        char a = 'E';
        double b = (double) a;
        System.out.printf("charToDouble %f \n", b);
    }

    public static void charToBoolean() {

    }
    public static void intToByte() {
        int a = 15;
        byte b = (byte) a;
        System.out.printf("intToByte %d \n", b);
    }
    public static void intToShort() {
        int a = 15;
        short b = (short) a;
        System.out.printf("intToShort %d \n", b);
    }
    public static void intToChar() {
        int a = 15;
        char b = (char) a;
        System.out.printf("intToChar %s \n", b);
    }
    public static void intToLong() {
        int a = 100;
        long b = a;
        System.out.printf("intToLong %d \n", b);
    }
    public static void intToFloat() {
        int a = 200;
        float b = a;
        System.out.printf("intToFloat %f \n", b);
    }
    public static void intToDouble() {
        int a = 300;
        double b = a;
        System.out.printf("intToDouble %f \n", b);
    }

    public static void longToByte() {
        long a = 15;
        byte b = (byte) a;
        System.out.printf("longToByte %d \n", b);
    }
    public static void longToShort() {
        long a = 15;
        short b = (short) a;
        System.out.printf("longToShort %d \n", b);
    }
    public static void longToChar() {
        long a = 15789555559L;
        char b = (char) a;
        System.out.printf("longToChar %s \n", b);
    }
    public static void longToInt() {
        long a = 490;
        int b = (int) a;
        System.out.printf("longToInt %d \n", b);
    }
    public static void longToFloat() {
        int a = 20788;
        float b = a;
        System.out.printf("longToFloat %f \n", b);
    }
    public static void longToDouble() {
        int a = 3054;
        double b = a;
        System.out.printf("longToDouble %f \n", b);
    }


    public static void floatToByte() {
        float a = 19;
        byte b = (byte) a;
        System.out.printf("intToByte %d \n", b);
    }
    public static void floatToShort() {
        float a = 15;
        short b = (short) a;
        System.out.printf("intToShort %d \n", b);
    }
    public static void floatToChar() {
        float a = 1578329;
        char b = (char) a;
        System.out.printf("intToChar %s \n", b);
    }
    public static void floatToInt() {
        float a = 670;
        int b = (int) a;
        System.out.printf("floatToInt %d \n", b);
    }
    public static void floatToLong() {
        float a = 2078;
        long b = (long) a;
        System.out.printf("floatToLong %d \n", b);
    }
    public static void floatToDouble() {
        int a = 3054;
        double b = a;
        System.out.printf("floatToDouble %f \n", b);
    }

    public static void doubleToByte() {
        double a = 195675756;
        byte b = (byte) a;
        System.out.printf("doubleToByte %d \n", b);
    }
    public static void doubleToShort() {
        double a = 153333;
        short b = (short) a;
        System.out.printf("doubleToShort %d \n", b);
    }
    public static void doubleToChar() {
        double a = 1578329;
        char b = (char) a;
        System.out.printf("doubleToChar %s \n", b);
    }
    public static void doubleToInt() {
        double a = 670;
        int b = (int) a;
        System.out.printf("doubleToInt %d \n", b);
    }
    public static void doubleToLong() {
        double a = 2078;
        long b = (long) a;
        System.out.printf("doubleToLong %d \n", b);
    }
    public static void doubleToFloat() {
        double a = 3054;
        float b = (float) a;
        System.out.printf("doubleToFloat %f \n", b);
    }
}