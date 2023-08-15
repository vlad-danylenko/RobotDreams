package src.streamapi2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        System.out.println("*** disticnt ***");
        List<String> listDistinct = Arrays.asList("a1", "a2", "a2", "a2", "b1", "c2", "c1");
        //List<String> newlistDistinct = listDistinct.stream().distinct().toList();
        //System.out.println(newlistDistinct);
        listDistinct.stream().distinct().forEach(System.out::println);

        System.out.println("*** sorted ***");
        //listDistinct.stream().distinct().sorted().forEach(System.out::println);
        listDistinct.stream().sorted().forEach(System.out::println);
        System.out.println("*** reverse order ***");
        listDistinct.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("*** for each ***");
        listDistinct.stream().forEach(
                string -> {
                    if (string.length() > 5) {
                        System.out.println(string + " greater than 5");
                    } else {
                        System.out.println(string + " less than 5");
                    }
                }
        );

        Stream.of("1", "2", "3").collect(Collectors.toList());
        System.out.println("*** Min / max integer ***");
        List<Integer> myIntegerList = new ArrayList<>();
        myIntegerList.add(1);
        myIntegerList.add(15);
        myIntegerList.add(87);
        myIntegerList.add(18);

        int min = myIntegerList.stream().min(Comparator.naturalOrder()).orElse(-1);
        int max = myIntegerList.stream().max(Comparator.naturalOrder()).orElse(-1);

        System.out.println("Мінімальне число: " + min + ". Максимальне число: " + max);

        //Optional<Integer> minNumber = myIntegerList.stream().min(Integer::compare);
        //minNumber.ifPresent(min -> System.out.println("Мінімальне число " + min));

        //Optional<Integer> maxNumber = myIntegerList.stream().max(Integer::compare);
        //maxNumber.ifPresent(max -> System.out.println("Максимальне число " + max));

        System.out.println("*** Check if smth present ***");
        boolean listDRes = listDistinct.stream().anyMatch(s -> Objects.equals(s, "a1"));
        System.out.println(listDRes);
        System.out.println("*** Check if all records length <= 5 ***");
        System.out.println(listDistinct.stream().allMatch(string -> string.length() <= 5));

        System.out.println("*** MAP. Modify objects");
        System.out.println("to UPPERCASE");
        String listDelimiter = myList.stream().map(String::toUpperCase).collect(Collectors.joining(", ")); // add delimiter
        System.out.println(listDelimiter);
        System.out.println("to BOOLEAN");
        myList.stream().map(
                i -> {
                    if (i.contains("a")) {
                        return true;
                    } else {
                        return false;
                    }
                }
        ).forEach(System.out::println);

        List<Human> list = List.of(new Human("Vladyslav", "Danylenko", "vlad.danilenko@outlook.com", new Cat("Rika")));
        List<Cat> catList = list.stream().filter(human -> Objects.equals(human.getName(), "Vladyslav")).map(
                Human::getCat
        ).filter(cat -> Objects.equals(cat.getName(),"Rika")).toList();
        System.out.println(catList);

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("a",1);
        myMap.put("b",2);
        myMap.put("c",3);
        myMap.put("d",68);
        myMap.put("e",15);
        myMap.put("f",14);
        myMap.put("g",24);

        myMap.values().stream().filter(n -> n % 2 == 0).sorted().forEach(System.out::println);

        System.out.println("*** Average ***");
        Set<Integer> number = new HashSet<>(Arrays.asList(5,10,2,3,6,7,8));
        number.stream().mapToInt(Integer::intValue).average().ifPresent(System.out::println);

        System.out.println(checkOptional().orElse("Other result"));

        List<String> fruitsAll = Arrays.asList("banana","apple", "blueberry", "cherry");
        String res = checkOptional().orElseGet(
                () -> {
                    String resultOptional;
                    Optional<String> resultOfFilter = fruitsAll.stream().filter(
                            b -> b.equals("banana")
                    ).findFirst();
                    resultOptional = resultOfFilter.orElse("no banana in list");
                    return resultOptional;
                }
        );
        System.out.println(res);

    }

    private static Optional<String> checkOptional() {
        return Optional.ofNullable(null);
    }
}
