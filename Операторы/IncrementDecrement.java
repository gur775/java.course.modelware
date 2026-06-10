public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 0;

        // Постфиксный инкремент (x++)
        System.out.println("Постфиксный x++:");
        System.out.println("Исходный x = " + x);      // 0
        System.out.println("x++ = " + (x++));          // 0 (возвращает старое)
        System.out.println("После x++ x = " + x);      // 1

        x = 0;
        // Префиксный инкремент (++x)
        System.out.println("\nПрефиксный ++x:");
        System.out.println("Исходный x = " + x);       // 0
        System.out.println("++x = " + (++x));          // 1 (возвращает новое)
        System.out.println("После ++x x = " + x);      // 1

        x = 0;
        // Постфиксный декремент (x--)
        System.out.println("\nПостфиксный x--:");
        System.out.println("Исходный x = " + x);       // 0
        System.out.println("x-- = " + (x--));          // 0
        System.out.println("После x-- x = " + x);      // -1

        x = 0;
        // Префиксный декремент (--x)
        System.out.println("\nПрефиксный --x:");
        System.out.println("Исходный x = " + x);       // 0
        System.out.println("--x = " + (--x));          // -1
        System.out.println("После --x x = " + x);      // -1

        // ~ (побитовое НЕ) и ! (логическое НЕ)
        int bits = 5;
        System.out.println("\n~" + bits + " = " + (~bits));  // -6

        boolean flag = true;
        System.out.println("!" + flag + " = " + (!flag));    // false
    }
}
