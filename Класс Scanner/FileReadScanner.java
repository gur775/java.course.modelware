import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadScanner {
    public static void main(String[] args) {
        // Указывается путь к файлу
        File file = new File("example.txt");

        // Используем try-with-resources для автоматического закрытия сканера
        try (Scanner scanner = new Scanner(file)) {

            // Файл читается построчно
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
    }
}
