package src.collections2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        mySet.add("Hello");
        mySet.add("World");
        mySet.add("Hello1");


        for (String element: mySet) {
            System.out.println(element);
        }
        System.out.println("***");

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);

            if (element.equals("Hello1")) {
                iterator.remove();
            }

        }

        System.out.println("***\nAfter delete");
        System.out.println(mySet);

        System.out.println("*** Add humans ***");
        HashSet <Human> humanSet = new HashSet<>();
        Human vladDanylenko = new Human(26, "Vladyslav","Danylenko");
        Human filippKuzmin = new Human(30,"Filipp", "Kuzmin");
        Human alyonaBondar = new Human(30, "Alyona","Bondar");

        humanSet.add(vladDanylenko);
        humanSet.add(filippKuzmin);
        humanSet.add(alyonaBondar);

        System.out.println(humanSet);
        System.out.println(humanSet.size());

        System.out.println(humanSet.contains(vladDanylenko));
    }
}

