import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения данных из консоли
        Scanner scanner = new Scanner(System.in);

        // Ввод имени
        System.out.print("Введите ваше имя: ");

        String name = scanner.nextLine();

        // Выводим приветствие
        System.out.println("Привет, " + name);

        scanner.close();
    }
}
