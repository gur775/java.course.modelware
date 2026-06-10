public class ComparisonOperator {
    public static void main(String[] args) {
        int a = 1, b = 17, c = 1;

        // == (равно)
        System.out.println("a == b: " + (a == b));  // false
        System.out.println("a == c: " + (a == c));  // true

        // > (больше)
        System.out.println("a > b: " + (a > b));    // false
        System.out.println("b > a: " + (b > a));    // true

        // >= (больше или равно)
        System.out.println("a >= c: " + (a >= c));  // true
        System.out.println("a >= b: " + (a >= b));  // false

        // < (меньше)
        System.out.println("a < b: " + (a < b));    // true

        // <= (меньше или равно)
        System.out.println("a <= c: " + (a <= c));  // true
    }
}
