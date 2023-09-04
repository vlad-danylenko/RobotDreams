package src.reflection;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Class<Student> studentClass = Student.class;

        System.out.println(studentClass.getName());
        System.out.println(studentClass.getModifiers());
        System.out.println(Modifier.toString(studentClass.getModifiers()));

        System.out.println(studentClass.getSuperclass());
        System.out.println(Arrays.toString(studentClass.getInterfaces()));


        Field[] fields = studentClass.getDeclaredFields();
        Arrays.stream(fields).forEach(System.out::println);

        Method[] methods = studentClass.getMethods();
        Arrays.stream(methods).forEach(System.out::println);

        try {
            Method setMethodName = studentClass.getMethod("setName", String.class);
            Student student = new Student();

            setMethodName.invoke(student,"Vladyslav");
            System.out.println(student.getName());

        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        Constructor[] constructors = studentClass.getConstructors();
        Arrays.stream(constructors).forEach(System.out::println);

        try {
            Constructor<Student> constructor = studentClass.getConstructor(String.class);

            Student student1 = constructor.newInstance("Vladyslav");
            System.out.println(student1.getName());
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
