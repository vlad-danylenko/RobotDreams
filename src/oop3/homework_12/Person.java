package src.oop3.homework_12;

public class Person {

    public static int age = getAge();
    private static int getAge() {
        System.out.println("1");
        return 26;
    }

    static {
        System.out.println("2");
    }

    {
        System.out.println("3");
    }
    public Person () {
        System.out.println("4");
    }
    public static void test() {
        System.out.println("5");
    }

}
