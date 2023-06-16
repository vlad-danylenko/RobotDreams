package src.lesson_6;

import java.util.Scanner;

public class lesson6 {
    public static void main(String[] args) {
        /*for (int i=0;i<=100; i++ ) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
    }*/

/*
        int n1 = 0, n2 = 1, n3 = 0;
        while (n3 <= 100) {
            System.out.println(n3);
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
*/
/*        int a = 3;
        for (int i = 1; i<=10; i++) {
            System.out.println(a + "*" + i + "=" + a * i);
        }*/

        Scanner reader = new Scanner(System.in);
        System.out.println("база");
        int num = reader.nextInt();
        System.out.println("ступінь");
        int num2 = reader.nextInt();
        int r = 1;
        for (int i=1; i<=num2; i++) {
            r = r*num;
      }
        System.out.println(r);
    }
}