public class Exceptions {

    public static void main(String[] args) {

        //Исключение будет перехвачено
        try {
            System.out.println("Пытаемся выполнить код с исключением...");
            generateCaughtException();
            System.out.println("Этот текст не будет выведен");
        } catch (ArithmeticException e) {
            System.out.println("Исключение перехвачено: " + e.getMessage());
        }

        System.out.println("\nПрограмма продолжает работу после catch блока\n");

        //Исключение приведет к аварийной остановке
        System.out.println("Пытаемся выполнить код, который выбросит неперехваченное исключение...");
        generateUncaughtException();

        // Эта строка не выполнится из-за аварийной остановки
        System.out.println("Этот текст не выведется");
    }

    //перехваченное исключение
    public static void generateCaughtException() {
        System.out.println("  -> Деление на ноль...");
        int result = 10 / 0;  // Генерирует ArithmeticException
    }

    // неперехваченное исключение
    public static void generateUncaughtException() {
        System.out.println("  -> Создание массива с отрицательным размером...");
        int[] array = new int[-5];  // Генерирует NegativeArraySizeException
    }
}
