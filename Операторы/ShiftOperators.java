public class ShiftOperators {
    public static void main(String[] args) {
        int a = 16;  // 10000 в двоичной

        // << (сдвиг влево) - умножение на 2^n
        System.out.println("16 << 1 = " + (a << 1));  // 32
        System.out.println("16 << 2 = " + (a << 2));  // 64
        System.out.println("16 << 3 = " + (a << 3));  // 128

        // >> (сдвиг вправо со знаком)
        System.out.println("16 >> 1 = " + (a >> 1));  // 8
        System.out.println("16 >> 2 = " + (a >> 2));  // 4

        // >>> (беззнаковый сдвиг вправо)
        int negative = -16;
        System.out.println("-16 >>> 1 = " + (negative >>> 1));  // 2147483640
        System.out.println("-16 >> 1 = " + (negative >> 1));    // -8
    }
}
