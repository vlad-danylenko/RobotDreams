package src.generics.homework_15;

public class Main {
    public static void main(String[] args) {
        Pair<Integer> pairInt = new Pair<>(20,23);
        Pair<String> pairString = new Pair<>("Hello", "World");
        Human human = new Human("Vladyslav", 26);
        Human human1 = new Human("Alyona", 26);
        Pair<Object> pairObject = new Pair<>(human,human1);

        System.out.println("First element: " + pairInt.getFirst() + ". Second element: " + pairInt.getSecond());
        System.out.println("First element: " + pairString.getFirst() + ". Second element: " + pairString.getSecond());
        System.out.println("First element: " + pairObject.getFirst() + ". Second element: " + pairObject.getSecond());

    }
}
