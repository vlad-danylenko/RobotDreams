package src.abstractclass.homework_13;

public class Main {
    public static void main(String[] args) {
        Person student = new Student("Vladyslav", "Danylenko", 26, "UA12345");
        Person teacher = new Teacher("Oksana", "Yantsur", 30, "Math");

        student.getPersonInfo();
        teacher.getPersonInfo();
    }
}
