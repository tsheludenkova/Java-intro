package lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class Program2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Optional<Integer> optional1 = list.stream().max(Integer::compare);

        System.out.println(orElseGet(optional1,
                Program2::getDefault));
    }


    static <T> T orElseGet(Optional<T> optional, Supplier<T> supplier) {
        if (optional.isPresent()){
            return optional.get();
        }
         else
        {
            return supplier.get();
        }
    }


   static int getDefault() {
        return 1000;
    }
}
