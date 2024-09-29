
import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        out.println("Введите текст и нажмите <Enter>: ");
        String text = new Scanner(in).nextLine();
        System.out.println("Длина текстаа: " + text.length());

    }
}
