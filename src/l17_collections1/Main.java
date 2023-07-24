package src.l17_collections1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*LinkedList <Integer> linkList = new LinkedList<>();
        linkList.add(1);
        linkList.add(2);
        linkList.add(3);
        linkList.add(4);
        linkList.add(5);
        linkList.add(6);
        linkList.add(7);

        System.out.println(linkList.getLast());
        System.out.println(linkList.get(2));*/

        List<String> arrayString = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add elements");
        for (int i = 1; i<=3; i++) {
            System.out.print("Element " + i + ": ");
            arrayString.add(scanner.nextLine());
        }

        System.out.println(arrayString);
        System.out.println("Show elements");
        for (int i = 0; i< arrayString.size(); i++) {
            System.out.println("Element " + i + ": " + arrayString.get(i));
        }

        System.out.println("***");
        List<String> listArray = new LinkedList<>();
        System.out.println("Add elements");
        for (int i = 1; i<=3; i++) {
            System.out.print("Element " + i + ": ");
            listArray.add(scanner.nextLine());
        }

        System.out.println(arrayString);
        System.out.println("Show elements");
        for (int i = 0; i< listArray.size(); i++) {
            System.out.println("Element " + i + ": " + listArray.get(i));
        }

    }
}
