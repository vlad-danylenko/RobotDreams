package src.collections2.homework;

import java.util.*;

public class Main {
    private final static int minRange = 1;
    private final static int maxRange = 50;
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(1000);
        TreeSet<Integer> treeSet = new TreeSet<>();

        addRandomValues(hashSet);
        System.out.println("\nHashSet Result\n" + hashSet);

        addRandomValues(linkedHashSet);
        System.out.println("\nLinkedHashSet Result\n" + linkedHashSet);

        addRandomValues(treeSet);
        System.out.println("\nTreeSet Result\n" + treeSet);
    }

    public static void addRandomValues(Set set) {
        Random random = new Random();
        for (int i = 0; i <= 1000; i++) {
            set.add(random.nextInt(maxRange - minRange + 1) + minRange);
        }
    }

}