package src.streamapi2.homework;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    private final static int maxRange = 50;
    public static void main(String[] args) {
        //1. Створити лист з 20 прізвищами. Вони повинні повторюватися. За допомогою стрім апі перетворити цей лист на мапу. У якості ключа повинно бути прізвище, а я якості значення кількість повторень його.
        List<String> surnames = List.of("Danylenko","Bondar","Kuzmin","Lutonina","Bondarenko","Kuzmenko","Danylenko","Bilous","Lakhtionova","Krasnopir","Lavronenko","Kuzmin","Panchenko","Lutonina","Danylenko","Kostenko","Kuzmin","Levchuk","Dubinchuk","Danylenko");
        Map<String,Long> surnamesCount = surnames.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(surnamesCount);

        //2. Заповнити лист випадковими числами. Знайти суму цих чисел за допомогою Stream API
        List<Integer> intArray = new ArrayList<>(20);
        Random random = new Random();
        for (int i = 0; i<=20; i++) {
            intArray.add(random.nextInt(maxRange));
        }

        System.out.println("Created array: " + intArray);
        int sum = intArray.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Elements sum: " + sum);


    }
}
