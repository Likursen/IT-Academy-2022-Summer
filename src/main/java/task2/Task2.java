package task2;

public class Task2 {
    private static int arraySize = 100;
    private static int[] array = new int[arraySize];

    public static int getArraySize() {
        return arraySize;
    }

    public static void setArraySize(int arraySize) {
        Task2.arraySize = arraySize;
    }

    public static int[] getArray() {
        return array;
    }

    public static void setArray(int[] array) {
        Task2.array = array;
    }
}
