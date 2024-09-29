import java.io.File;
import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
//        out.println("Введите текст и нажмите <Enter>: ");
//        String text = new Scanner(in).nextLine();
//        System.out.println("Длина текстаа: " + text.length());
//

        int fileCount = 0; // создаем счетчик верно указанных файлов
        while (true) {
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
            } else {
                // Если файл существует и это именно файл
                fileCount++; // Увеличиваем счетчик правильных файлов
                System.out.println("Путь указан верно. Это файл номер " + fileCount);
            }
        }
    }
}
