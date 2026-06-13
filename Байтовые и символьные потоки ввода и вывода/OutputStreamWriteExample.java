import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamWriteExample {
    public static void main(String[] args) {
        String filePath = "test_output.txt";

        System.out.println("Демонстрация метода write(int)\n");

        // write(int b) - записывает один байт (младшие 8 бит)
        try (FileOutputStream fos = new FileOutputStream(filePath)) {

            // Записываем отдельные байты
            fos.write(72);  // 'H'
            fos.write(101); // 'e'
            fos.write(108); // 'l'
            fos.write(108); // 'l'
            fos.write(111); // 'o'
            fos.write(32);  // пробел
            fos.write(87);  // 'W'
            fos.write(111); // 'o'
            fos.write(114); // 'r'
            fos.write(108); // 'l'
            fos.write(100); // 'd'
            fos.write(33);  // '!'

            System.out.println("Записано: Hello World!");

            // Перегруженные версии write()

            // 2. write(byte[] buffer) - запись массива байтов
            byte[] data = "\nЭто записано массивом".getBytes();
            fos.write(data);
            System.out.println("Записано массивом: " + new String(data));

            // 3. write(byte[] buffer, int offset, int length)
            byte[] moreData = "1234567890".getBytes();
            fos.write(moreData, 2, 5); // запишет "34567"
            System.out.println("Записано со смещением 2, длиной 5: " +
                    new String(moreData, 2, 5));

        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
        }

        System.out.println("\nПобайтовая запись строки\n");

        try (FileOutputStream fos = new FileOutputStream("ascii_demo.txt")) {
            String text = "Java Programming";

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                // write() записывает только младшие 8 бит
                // символы вне ASCII могут быть потеряны
                fos.write((int) ch);
                System.out.printf("Записан символ: %c (код: %d)%n", ch, (int) ch);
            }

        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
