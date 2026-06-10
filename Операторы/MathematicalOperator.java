public class MathematicalOperator {
    public static void main(String[] args) {
        int a = 10, b = 3;

        // Сложение
        System.out.println("a + b = " + (a + b));  // 13

        // Вычитание
        System.out.println("a - b = " + (a - b));  // 7

        // Умножение
        System.out.println("a * b = " + (a * b));  // 30

        // Деление
        System.out.println("a / b = " + (a / b));  // 3 (целочисленное)
        System.out.println("10.0 / 3 = " + (10.0 / 3));  // 3.333...

        // Остаток от деления
        System.out.println("a % b = " + (a % b));  // 1

        // String конкатенация
        String str1 = "Hello";
        String str2 = " World";
        System.out.println(str1 + str2);  // Hello World
        System.out.println("Number: " + a);  // Number: 10
    }
}
