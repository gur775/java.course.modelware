public class Practice1 {
    public static void main(String[] args) {

        // decode() - преобразует строку в Integer с учётом систем счисления

        // Десятичная система (по умолчанию)
        Integer dec = Integer.decode("123");
        System.out.println(dec); // 123

        // Шестнадцатеричная (0x или #)
        Integer hex1 = Integer.decode("0xFF");
        Integer hex2 = Integer.decode("#FF");
        System.out.println(hex1); // 255
        System.out.println(hex2); // 255

        // Восьмеричная (0)
        Integer oct = Integer.decode("077");
        System.out.println(oct); // 63 (7*8 + 7)

        // С отрицательным знаком
        Integer negative = Integer.decode("-0x10");
        System.out.println(negative); // -16

        // С положительным знаком
        Integer positive = Integer.decode("+1807");
        System.out.println(positive); // 100
    }
}
