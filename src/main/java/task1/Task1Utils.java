package task1;

import java.util.Scanner;

public class Task1Utils {
    private static Scanner scanner = new Scanner(System.in);

    public static int setNumber() {
        return scanner.nextInt();
    }


    public static void addition(int FirstNumber, int SecondNumber) {
        System.out.println(FirstNumber + "+" + SecondNumber + "=" + (FirstNumber + SecondNumber));
    }

    public static void multiplication(int FirstNumber, int SecondNumber) {
        System.out.println(FirstNumber + "+" + SecondNumber + "=" + (FirstNumber * SecondNumber));
    }
}
