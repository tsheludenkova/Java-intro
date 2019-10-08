package lesson02;

public class MainStringMethods {

    static String string1 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
    static String string2 = "    It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.";
    static String string3 = "Lorem Ipsum";
    static String string4 = "LoRem IPSUM";
    static String subString1 = "simply";
    static String subString2 = "industry";

    public static void main(String[] args) {
        returnSymbol();
        stringConcatenation();
        checkEndingOfString();
        checkStringIgnoringCase();
        returnIndexOfSpecifiedCharacter();
        returnIndexOfSubString();
        returnLastIndexOfSpecifiedCharacter();
        returnLastIndexOfSubString();
        returnLengthOfString();
        stringReplace();
        stringSplit();
        checkStringStartsWithSpecifiedPrefix();
        returnNewBeginString();;
        returnNewBeginEndString();
        returnStringToCharArray();
        returnStringToLowerCase();
        returnStringToUpperCase();
        returnStringWithoutLeadingAndTrailingSpaces();
    }

    public static void returnSymbol() {
        char result1 = string1.charAt(8);
        System.out.println("The eighth symbol of the string is " + "'" + result1 + "'");
    }

    public static void stringConcatenation() {
        String s = string1.concat(" Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");
        System.out.println(s);
    }

    public static void checkEndingOfString() {
        boolean var1 = string1.endsWith("industry.");
        boolean var2 = string1.endsWith("industry");
        boolean var3 = string2.endsWith("setting, remaining essentially unchanged.");
        boolean var4 = string2.endsWith("essentially");
        System.out.println("string1 ends with 'industry. ': "+ var1);
        System.out.println("string1 ends with 'industry': "+ var2);
        System.out.println("string2 ends with 'setting, remaining essentially unchanged. ': "+ var3);
        System.out.println("string2 ends with 'essentially': "+ var4);
    }

    public static void checkStringIgnoringCase() {
        boolean var = string3.equalsIgnoreCase(string4);
        System.out.println(string3 + " is equal " + string4 + ": "+ var);
    }

    public static void returnIndexOfSpecifiedCharacter() {
        int var = string1.indexOf('d');
        System.out.println("Index of d: " + var);
    }

    public static void returnIndexOfSubString() {
        int var = string1.indexOf(subString1);
        System.out.println("Index of subString: " + var);
    }

    public static void returnLastIndexOfSpecifiedCharacter() {
        int var = string1.lastIndexOf('t');
        System.out.println("Last Index of d: " + var);
    }

    public static void returnLastIndexOfSubString() {
        int var = string1.lastIndexOf(subString2);
        System.out.println("Last Index of subString: " + var);
    }

    public static void returnLengthOfString() {
        int var = string1.length();
        System.out.println("Length of String1 = " + var);
    }

    public static void stringReplace() {
        String var = string1.replace('t', 'w');
        System.out.println("Replaced string :" + var);
    }

    public static void stringSplit() {
        for (String retval : string1.split(" ")) {
            System.out.println(retval);
        }
    }
    public static void checkStringStartsWithSpecifiedPrefix() {
        boolean var = string1.startsWith("Lorem");
        System.out.println("String starts with 'Lorem': " + var);
    }

    public static void returnNewBeginString() {
        String var = string1.substring(9);
        System.out.println("New string that begins from 9 index: " + var);
    }

    public static void returnNewBeginEndString() {
        String var = string1.substring(9, 20);
        System.out.println("New string that begins from 9 index to 20 index: " + var);
    }

    public static void returnStringToCharArray() {
        char[] var = string1.toCharArray();
        for (int i = 0; i< var.length; i++)
        System.out.println("Element [" + i + "]: " + var[i]);
    }
    public static void returnStringToLowerCase() {
        String var = string1.toLowerCase();
        System.out.println("String in lower case: " + var);;
    }

    public static void returnStringToUpperCase() {
        String var = string1.toUpperCase();
        System.out.println("String in upper case: " + var);;
    }

    public static void returnStringWithoutLeadingAndTrailingSpaces() {
        String var = string2.trim();
        System.out.println("String without leading and trailing spaces: " + var);
    }
}



