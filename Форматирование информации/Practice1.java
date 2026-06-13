import java.util.Date;
public class Practice1 {
    public static void main(String[] args) {
        // Спецификатор %s - строковое представление
        String word = "world";
        System.out.printf("1. %s: Hello, %s%n",
                "Строковый", word);

        // Спецификатор %d - десятичное целое
        int count = 25;
        System.out.printf("2. %s: Количество элементов: %d%n",
                "Десятичное целое", count);

        // Спецификатор %f - число с плавающей точкой
        double price = 10.63;
        System.out.printf("3. %s: Цена товара: %.2f рублей%n",
                "Плавающая точка", price);

        // Спецификатор %b - логическое значение
        boolean isActive = true;
        boolean hasAccess = false;
        System.out.printf("4. %s: Статус: %b, Доступ: %b%n",
                "Логический", isActive, hasAccess);

        // Спецификатор %c - символ
        char grade = 'A';
        char currency = '$';
        System.out.printf("5. %s: оценка: %c, Валюта: %c%n",
                "Символьный", grade, currency);

    }
}
