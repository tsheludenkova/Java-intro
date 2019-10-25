package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListCollection {

    public static void ShowCollection(ArrayList<String> cells) {
        Iterator < String > iter = cells.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public static void main(String[] args) {

        ArrayList<String> cells = new ArrayList<>();

        cells.add("Xiaomi");
        cells.add("Siemens");
        cells.add("Huawei");
        cells.add("iPhone");
        cells.add("Samsung");
        cells.add("LG");
        System.out.println(cells);
        cells.remove("iPhone");
        System.out.println(cells.contains("iPhone"));

        ShowCollection(cells);
        Collections.sort(cells);
        ShowCollection(cells);
    }
}

