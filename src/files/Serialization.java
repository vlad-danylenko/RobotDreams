package src.files;

import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        serialization();
        deSerialization();

    }

    private static void serialization() {
        Student student = new Student();
        student.setName("Vladyslav");
        student.setSurname("Danylenko");
        student.setAge(26);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.bin"))) {
            oos.writeObject(student);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void deSerialization() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.bin"))) {
            Student obj = (Student) ois.readObject();
            System.out.println(obj);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
