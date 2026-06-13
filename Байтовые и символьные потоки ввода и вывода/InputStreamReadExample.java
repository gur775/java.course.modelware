import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamReadExample {
    public static void main(String[] args) {
        // Создаём файл для примера
        String filePath = "test_input.txt";

        // Демонстрация метода read() - побайтовое чтение
        System.out.println("Демонстрация метода read()\n");

        try (FileInputStream fis = new FileInputStream(filePath)) {
            int byteData;
            int position = 0;

            // read() возвращает:
            // - int от 0 до 255 (значение прочитанного байта)
            // - -1 если достигнут конец файла
            while ((byteData = fis.read()) != -1) {
                System.out.printf("Байт #%d: %d (символ: %c)%n",
                        position++, byteData, (char) byteData);
            }

        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }

        // перегруженные версии read()
        System.out.println("\nПерегруженные версии read()\n");

        try (FileInputStream fis = new FileInputStream(filePath)) {
            // read(byte[] buffer) - чтение в массив байтов
            byte[] buffer = new byte[10];
            int bytesRead = fis.read(buffer);
            System.out.println("Прочитано байтов: " + bytesRead);
            System.out.println("Содержимое буфера: " + new String(buffer, 0, bytesRead));

            // read(byte[] buffer, int offset, int length) - чтение со смещением
            fis.getChannel().position(0); // возвращаемся в начало
            byte[] buffer2 = new byte[20];
            int bytesRead2 = fis.read(buffer2, 5, 10);
            System.out.println("\nПрочитано с offset 5: " + bytesRead2);
            System.out.println("Буфер со смещением: " + new String(buffer2));

        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
