package lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class Program {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Optional<Integer> optional1 = list.stream().max(Integer:: compare);
        ifPresentOrElse(optional1,
                System.out :: println,
                ()-> System.out.println("Nothing") );

        ifPresent(optional1,
                System.out :: println);



        list.add(1);
        list.add(3);
        list.add(345);
        Optional<Integer> optional2 = list.stream().max(Integer:: compare);
        ifPresentOrElse(optional2,
                System.out :: println,
                ()-> System.out.println("Nothing") );

    }

    static <T> void ifPresentOrElse (Optional<T> optional, Consumer<T> consumer, Runnable runnable)
    {
        if (optional.isPresent()) {
            consumer.accept(optional.get());
        }
        else {
            runnable.run();
        }
    }

    static <T> void ifPresent (Optional<T> optional, Consumer<T> consumer)
    {
        if (optional.isPresent()) {
            consumer.accept(optional.get());
        }

    }


}
