package task2;

import java.util.Random;

public class Task2Utils {
    public static void fillingArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 100);
        }
    }

    public static void printArray(int[] array) {
        System.out.println("Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printPositiveOddNumberCount(int[] array) {
        int positiveOddNumberCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] > 0)
                positiveOddNumberCount++;
        }
        System.out.println("Count of positive odd number: " + positiveOddNumberCount);
    }
}
