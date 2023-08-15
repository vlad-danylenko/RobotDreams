package src.arrays;

public class task1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum = sum+array1[i];
        }
        System.out.println(sum);
    }
}
