package src.files;

import java.io.*;

public class Practice {
    public static void main(String[] args) {


    }

    private static void readerWritter () {
        File file = new File("reader.txt");
        if (file.exists()) {
            readFromFile(file);
        } else {
            writeToFile(file, "test test test");
        }
    }

    private static void writeToFile(File file, String content) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFromFile (File file) {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(file)) {
            int ch;
            while((ch = fileReader.read()) != -1) {
                stringBuilder.append((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void simpleReadWrite() {
        File file = new File("test.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
                writeToFile("text.txt", "test test test");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String content = readFile("test.txt");
        System.out.println(content);
    }

    private static void writeToFile(String filePath, String content) {
        try (OutputStream outputStream = new FileOutputStream(filePath, false)) {
            byte[] bytes = content.getBytes();
            outputStream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFile(String filePath) {

        StringBuilder content = new StringBuilder();

        try (InputStream inputStream = new FileInputStream(filePath)){
            int ch;
            while((ch = inputStream.read()) != -1) {
                content.append((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}

