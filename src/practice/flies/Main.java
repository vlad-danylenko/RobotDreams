package src.practice.flies;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "filename.txt";
        File myFile = new File(fileName);
        if (myFile.createNewFile()) {
            System.out.println("File created: " + myFile.getName());
        } else if (myFile.exists()) {
            System.out.println("File already created");
        } else {
            System.out.println("Something went wrong");
        }

        FileWriter writeFile = new FileWriter(fileName);
        writeFile.write("Files in Java might be tricky, but it is fun enough!");
        writeFile.close();
        System.out.println("Text added");

        Scanner readFile = new Scanner(myFile);
        while (readFile.hasNextLine()) {
            String data = readFile.nextLine();
            System.out.println(data);
        }

        myFile.delete();
    }
}
