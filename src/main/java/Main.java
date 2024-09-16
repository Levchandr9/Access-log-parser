import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число");
        int secondNumber = new Scanner(System.in).nextInt();
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        double multiplication = (double) firstNumber * secondNumber;
        double division = (double) firstNumber / secondNumber;
        double remainder = (double) firstNumber % secondNumber;
        System.out.println(firstNumber + "+" + secondNumber + "=" + addition);
        System.out.println(firstNumber + "-" + secondNumber + "=" + subtraction);
        System.out.println(firstNumber + "*" + secondNumber + "=" + multiplication);
        System.out.println(firstNumber + "/" + secondNumber + "=" + division);
        System.out.println("Остаток от деления " +  firstNumber + " на " + secondNumber + " = " + remainder);

    }
}
