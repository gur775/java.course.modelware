public class Practice4 {
    public static void main(String[] args) {

        String base = "Result: ";

        // String + примитивные типы
        System.out.println(base + 56);
        System.out.println(base + 2.57);
        System.out.println(base + true);
        System.out.println(base + 'A');

        // String + объекты
        System.out.println(base + new Object()); // "Result: java.lang.Object@..."
        System.out.println(base + new Integer(14));

        // Порядок имеет значение!
        System.out.println(10 + 20 + " = sum");
        System.out.println("sum = " + 10 + 20);

        // Смешанные операции
        System.out.println("Value: " + 5 * 2);
        System.out.println(5 * 2 + " = value");
    }
}
