package src.files.homework;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        File file = new File("file_homework.txt");

        User vlad = new User("Vlad", 26);
        User max = new User("Max", 16);
        User mykola = new User("Mykola", 30);
        User oleg = new User("Oleg", 10);

        createFileIfNotExists(file);

        checkUserAgeAndWriteToFile(file, vlad);
        checkUserAgeAndWriteToFile(file, max);
        checkUserAgeAndWriteToFile(file, mykola);
        checkUserAgeAndWriteToFile(file, oleg);

        readFromFile(file);
    }

    private static void createFileIfNotExists(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("Новий файл створено.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void checkUserAgeAndWriteToFile(File file, User user) {
        String ageCheck = user.getAge() >= 18 ? "так" : "ні";
        String content = "Користувач: " + user.getName() + ". Вік: " + user.getAge() + ". Перевірку пройдено: " + ageCheck;
        writeToFile(file, content);
    }

    private static void writeToFile(File fileName, String content) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write(content + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readFromFile(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
