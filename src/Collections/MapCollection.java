package Collections;

import java.util.HashMap;

public class MapCollection {
    public static void main(String[] args) {
        HashMap<Integer, String> code = new HashMap<>();
        code.put(1,"Nokia");
        code.put(2,"LG");
        code.put(3,"Samsung");
        code.put(4,"iPhone");
        System.out.println(code);

        code.replace(1,"Huavey");
        System.out.println(code);

        code.remove(3);
        System.out.println(code);
        System.out.println(code.get(4));
        System.out.println(code.containsKey(3));   // ??
        System.out.println(code.containsValue("LG"));



     /*   HashMap<String, Integer> code = new HashMap<>();
        code.put("Nokia",1);
        code.put("LG",2);
        code.put("Sismens",3);
        code.put("iPhone",4);
        System.out.println(code);

        code.replace("Huavey",1);
        System.out.println(code);

        code.remove(3);
        System.out.println(code);
        */
    }
}
