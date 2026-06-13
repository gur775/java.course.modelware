public class Practice6 {
    public static void main(String[] args) {

        // Сужающее преобразование (явное, возможна потеря данных)

        // int → byte
        int i1 = 130;
        byte b1 = (byte) i1;  // -126 (потеря старших битов)
        System.out.println("130 → byte: " + b1);

        // double → int
        double d1 = 3.99;
        int i2 = (int) d1;    // 3 (дробная часть отброшена)
        System.out.println("3.99 → int: " + i2);

        // long → short
        long l1 = 100000L;
        short s1 = (short) l1;  // -31072 (переполнение)
        System.out.println("100000 → short: " + s1);

        // int → char
        int i3 = 65;
        char c1 = (char) i3;    // 'A'
        System.out.println("65 → char: " + c1);

        // float → short
        float f1 = 32768.5f;
        short s2 = (short) f1;  // -32768 (переполнение)
        System.out.println("32768.5 → short: " + s2);
    }
}
