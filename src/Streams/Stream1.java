package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {

        IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(q -> (q%2 == 0)).filter(w -> w > 0).forEach(w -> System.out.println(w));
        System.out.println();


        ArrayList<String> cells = new ArrayList<>();

        cells.add("Xiaomi");
        cells.add("Siemens");
        cells.add("Huawei");
        cells.add("iPhone");
        cells.add("Samsung");
        cells.add("LG");
        System.out.println(cells);
        int count = (int) cells.stream()
                .filter(x-> x.length() == 6)
                .count();
                 System.out.println("Count of cells with a name in 6 symbols= " + count);
           //     .forEach(x-> System.out.println(x));


        IntStream.of(-5, 87, 4, -2, -1, 0, 1, 2, 3, 4, 5).sorted().forEach(x -> System.out.println(x));
}

}
