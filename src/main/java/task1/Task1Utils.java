package task1;

import java.util.Scanner;

public class Task1Utils {
    private static Scanner scanner = new Scanner(System.in);

    public static int setNumber() {
        return scanner.nextInt();
    }

    public static void addition(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + "+" + secondNumber + "=" + (firstNumber + secondNumber));
    }

    public static void multiplication(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + "+" + secondNumber + "=" + (firstNumber * secondNumber));
    }
}
