public class PracticeOne {
    public static void main(String[] args) {
        // Спецификатор %s - строковое представление
        String word = "world";
        System.out.printf("Hello, %s%n",
                "Строковый", word);

        // Спецификатор %d - десятичное целое
        int count = 10;
        System.out.printf("Количество элементов: %d%n",
                "Десятичное целое", count);

        // Спецификатор %f - число с плавающей точкой
        double price = 15.99;
        System.out.printf("Цена товара: %.2f рублей%n",
                "Плавающая точка", price);

        // Спецификатор %b - логическое значение
        boolean isActive = true;
        boolean hasAccess = false;
        System.out.printf("Статус: %b, Доступ: %b%n",
                "Логическое", isActive, hasAccess);

        // Спецификатор %c - символ
        char grade = 'A';
        char currency = '$';
        System.out.printf("оценка: %c, Валюта: %c%n",
                "Символьное", grade, currency);

    }
}
