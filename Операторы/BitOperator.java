public class BitOperator {
    public static void main(String[] args) {
        int a = 5;  // 0101 в двоичной
        int b = 3;  // 0011 в двоичной

        // | (побитовое ИЛИ)
        System.out.println("5 | 3 = " + (a | b));  // 7 (0111)

        // ^ (побитовое исключающее ИЛИ)
        System.out.println("5 ^ 3 = " + (a ^ b));  // 6 (0110)

        // & (побитовое И)
        System.out.println("5 & 3 = " + (a & b));  // 1 (0001)

        // ~ (побитовое НЕ)
        System.out.println("~5 = " + (~a));  // -6

        // С булевыми значениями
        boolean t = true, f = false;
        System.out.println("true | false = " + (t | f));   // true (вычисляет оба)
        System.out.println("true & false = " + (t & f));   // false
        System.out.println("true ^ true = " + (t ^ t));    // false
        System.out.println("true ^ false = " + (t ^ f));   // true
    }
}
