package src.collections_practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> vdArray = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean cont = true;
        while (cont) {

            System.out.print("Введіть слово");
            vdArray.add(scanner.nextLine());
        }

    }
}
