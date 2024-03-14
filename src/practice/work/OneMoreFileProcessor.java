package src.practice.work;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class OneMoreFileProcessor {

    public static void main(String[] args) {
        String inputFile = "mfo.csv";
        String outputFile = "mfo_res1.csv";

        try {
            int deletedRecords = processFile(inputFile, outputFile);
            System.out.println("Файл успішно оброблено. Видалено записів: " + deletedRecords);
        } catch (IOException e) {
            System.err.println("Помилка при обробці файлу: " + e.getMessage());
        }
    }

    private static int processFile(String inputFile, String outputFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        Set<String> uniqueLines = new HashSet<>();
        int deletedRecords = 0;

        String line;
        while ((line = reader.readLine()) != null) {
            if (isValidLine(line)) {
                // Додаємо унікальні рядки до множини
                uniqueLines.add(line);
            } else {
                // Збільшуємо лічильник видалених записів
                deletedRecords++;
            }
        }

        // Записуємо унікальні рядки у вихідний файл
        for (String uniqueLine : uniqueLines) {
            writer.write(uniqueLine);
            writer.newLine();
        }

        // Закриваємо потоки
        reader.close();
        writer.close();

        // Повертаємо кількість видалених записів
        return deletedRecords;
    }

    private static boolean isValidLine(String line) {
        // Перевірка на відповідність критеріям
        return line.startsWith("380") && line.length() == 12;
    }
}
