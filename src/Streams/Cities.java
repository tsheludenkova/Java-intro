package Streams;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program {

    private static int count = 0;
    private static int sum = 0;

    public static void main(String[] args) {

        List<String> cities  = new ArrayList<>();
        cities.add("London");
        cities.add("Paris");
        cities.add("Madrid");
        cities.add("Rome");
        cities.add("Barselona");

        cities.stream()
                .filter(city -> city.length() > 4)
                .peek(city -> count++)
                .forEach(city -> System.out.println(city));
        System.out.println(count);



        Arrays.stream(new Integer[] {5000, 2600, 9555}).forEach(price -> sum+=price);
        System.out.println(sum);



    }
}
