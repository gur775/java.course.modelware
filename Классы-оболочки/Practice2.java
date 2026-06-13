public class Practice2 {
    public static void main(String[] args) {

        // Конструктор с boolean
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(false);

        // Конструктор с String
        Boolean b3 = new Boolean("true");   // true
        Boolean b4 = new Boolean("TRUE");   // true (игнорирует регистр)
        Boolean b5 = new Boolean("false");  // false
        Boolean b6 = new Boolean("abc");    // false (не true → false)

        // Статический метод valueOf(boolean)
        Boolean b7 = Boolean.valueOf(true);
        Boolean b8 = Boolean.valueOf(false);

        // Статический метод valueOf(String)
        Boolean b9 = Boolean.valueOf("true");
        Boolean b10 = Boolean.valueOf("false");

        // Автоупаковка
        Boolean b11 = true;
        Boolean b12 = false;

        // Поля-константы (переиспользуемые объекты)
        Boolean b13 = Boolean.TRUE;
        Boolean b14 = Boolean.FALSE;

        // Из строки через parseBoolean (возвращает примитив)
        boolean primitive = Boolean.parseBoolean("true");
        Boolean b15 = primitive; // автоупаковка

        // Логические выражения
        Boolean b16 = 5 > 3;   // true
        Boolean b17 = 5 < 3;   // false
    }
}
