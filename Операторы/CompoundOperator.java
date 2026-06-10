public class CompoundOperator {
    public static void main(String[] args) {
        int x = 10;

        // +=
        x += 5;  // x = x + 5
        System.out.println("+= : " + x);  // 15

        // -=
        x -= 3;  // x = x - 3
        System.out.println("-= : " + x);  // 12

        // *=
        x *= 2;  // x = x * 2
        System.out.println("*= : " + x);  // 24

        // /=
        x /= 4;  // x = x / 4
        System.out.println("/= : " + x);  // 6

        // %=
        x %= 4;  // x = x % 4
        System.out.println("%= : " + x);  // 2

        // Со String
        String text = "Java";
        text += " Programming";
        System.out.println(text);
    }
}
