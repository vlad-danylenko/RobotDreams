package src.lesson_9.homework_9;


public class Main {
    public static void main(String[] args) {
        /*
        Створити клас, який описує студента(з ім'ям / призвіщем / віком)
        та клас для опису викладача (з ім'ям / призвіщем / віком / студентом(ваш клас) до нього,
        додати гетери / сетери, створити об'єкти в вашому мейн методі
         */

        Student student = new Student("Vladyslav", "Danylenko", "26");
        Teacher teacher = new Teacher();

        teacher.setName("Alyona");
        teacher.setSurname("Bondar");
        teacher.setAge("30");
        teacher.setStudent(student.getName().concat(" ").concat(student.getSurname()));

        // Student info
        System.out.println("Student: " + student.getName().concat(" ").concat(student.getSurname()) + ". Age: " + student.getAge());

        // Teacher info
        System.out.println("Teacher: " + teacher.getName().concat(" ").concat(teacher.getSurname()) +
                ". Age: " + teacher.getAge() + ". Student: " + teacher.getStudent());

    }
}
