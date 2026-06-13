public class Practice5 {
    public static void main(String[] args) {

        // Правило: меньший тип расширяется до большего

        // int + long = long
        int i = 10;
        long l = 20L;
        long result1 = i + l;  // long
        System.out.println("int + long = long: " + result1);

        // int + double = double
        double result2 = i + 3.5;  // double
        System.out.println("int + double = double: " + result2);

        // byte + short = int
        byte b = 10;
        short s = 20;
        int result3 = b + s;  // int (не byte и не short!)
        System.out.println("byte + short = int: " + result3);

        // char + int = int
        char c = 'A';  // 65
        int result4 = c + 1;  // 66
        System.out.println("char + int = int: " + result4);

        // float + double = double
        float f = 3.14f;
        double d = 2.5;
        double result5 = f + d;  // double
        System.out.println("float + double = double: " + result5);
    }
}
