package src.files;

import java.io.*;

public class Lecture {
    public static void main(String[] args) {
        File file = new File("myfile.txt");
        readFromFile(file);
        //writeToFile(file);


    }

    private static void writeToFile(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("New file created");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true))) {
            bufferedWriter.write("Текст\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readFromFile(File file) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) !=null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
