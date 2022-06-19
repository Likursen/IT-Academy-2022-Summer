package task1;

public class Task1Starter {
    public static void main(String[] args) {
        Task1.setFirstNumber(Task1Utils.setNumber());
        Task1.setSecondNumber(Task1Utils.setNumber());

        Task1Utils.addition(Task1.getFirstNumber(), Task1.getSecondNumber());
        Task1Utils.multiplication(Task1.getFirstNumber(), Task1.getSecondNumber());
    }
}
