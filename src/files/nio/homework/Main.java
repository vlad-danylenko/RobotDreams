package src.files.nio.homework;
import java.io.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws IOException {

        User vlad = new User("Vlad", 26);
        User max = new User("Max", 16);
        User mykola = new User("Mykola", 30);
        User oleg = new User("Oleg", 10);

        Path filePath = Paths.get("nio_homework.txt");
        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }

        checkUserAgeAndWriteToFile(vlad);
        checkUserAgeAndWriteToFile(max);
        checkUserAgeAndWriteToFile(mykola);
        checkUserAgeAndWriteToFile(oleg);

        readFromFile();
    }

    private static void checkUserAgeAndWriteToFile(User user) {
        String ageCheck = user.getAge() >= 18 ? "так" : "ні";
        String content = "Користувач: " + user.getName() + ". Вік: " + user.getAge() + ". Перевірку пройдено: " + ageCheck + "\n";
        writeToFile(content);
    }

    private static void writeToFile(String content) {

        try {
            Files.writeString(Path.of("nio_homework.txt"), content, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFromFile() {
        try {
            String content = Files.readString(Path.of("nio_homework.txt"));
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
