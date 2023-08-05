package src.streamapi1;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        SimpleInterface simpleInterface = (a,b) -> a + b;
        int result = simpleInterface.doSomenthing(5,3);
        System.out.println(result);

        Predicate<String> checkIfGreaterThan5 = str -> str.length() > 5;
        System.out.println(checkIfGreaterThan5.test("Hello World"));

        Function <String, Integer> stringLength = str -> str.length();
        System.out.println("К-сть символів: " + stringLength.apply("Hello World"));

        Consumer<String> printStringConsumer = str -> System.out.println(str);
        printStringConsumer.accept("Hello World!");

        Supplier<LocalDateTime> currentTimeSupplier = () -> LocalDateTime.now();
        System.out.println(currentTimeSupplier.get());

        List<String> names = Arrays.asList("Vlad", "Max", "Filipp", "Vova", "Vasya");
        List<String> names1 = Stream.of("Vlad", "Max", "Filipp", "Vova", "Vasya").toList();
        List<String> names2 = List.of("Vlad", "Max", "Filipp", "Vova", "Vasya");

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("V"))
                .toList();

        System.out.println(names);
        System.out.println(filteredNames);

        List<String> list = Arrays.asList("Java","Python","C++");
        list.stream().forEach(System.out::println);
        list.stream().filter(s -> s.startsWith("J")).forEach(System.out::println);
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        List<Integer> result1 = list.stream().map(
                language -> {
                    if (language.equals("Java")) {
                        return 1;
                    } else {
                        return 2;
                    }
                }
        ).toList();

        System.out.println(result1);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);
        System.out.println(sum.get());


    }
}
