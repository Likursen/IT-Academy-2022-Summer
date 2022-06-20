package task1;

import java.util.Scanner;

class Utils {

    public static int scanNumber() {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void printMultiplyResult(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + "*" + secondNumber + "=" + (firstNumber * secondNumber));
    }

    public static void printSumResult(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + "+" + secondNumber + "=" + (firstNumber + secondNumber));
    }
}
