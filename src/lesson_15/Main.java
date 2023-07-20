package src.lesson_15;

public class Main <H,E> {
    public static void main(String[] args) {
    Human human = new Human<>("Vladyslav","Danylenko",26,"Ukraine");

        System.out.println(human.getName() + " " + human.getAge());
        Integer[] intArray = {1,2,3,4,5};
        Human [] humanArray = {new Human<>("Alina","Lakhtionova",25,"Ukraine")};
        Human [] humanArray1 = {new Human<>("Natalia","Krasnopir",24,"Ukraine")};

        printArray(intArray);
        printArray(humanArray);
        printArray(humanArray1);

        Numeric<Integer> numeric = new Numeric<>(10);
        System.out.println(numeric.getValue());

    }

    private static <E> void printArray (E [] array) {
        int i = 1;
        for (E element: array) {
            System.out.println(i++ + ": " + element );
        }
        System.out.println();
    }
}
