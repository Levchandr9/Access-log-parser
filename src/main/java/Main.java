import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
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
*/

        int fileCount = 0; // создаем счетчик верно указанных файлов
        while (true){
            // запрашиваем путь к файлу
            System.out.println("Введите путь к файлу:");
            String path = new Scanner(System.in).nextLine();

            // Создаем объект File
            File file = new File(path);

            // Проверяем, существует ли файл и является ли это директорией
            boolean fileExists = file.exists();
            boolean isFile = file.isFile();

            // Проверка условий
            if (!fileExists || !isFile) {
                // Если файл не существует или это не файл (то есть это может быть директория)
                System.out.println("Указанный путь не существует или это не файл. Попробуйте снова.");
                continue; // Возвращаемся к началу цикла
            }
            else {
                // Если файл существует и это именно файл
                fileCount++; // Увеличиваем счетчик правильных файлов
                System.out.println("Путь указан верно. Это файл номер " + fileCount);
            }
        }
    }
}
