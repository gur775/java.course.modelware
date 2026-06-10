public class SwitchTypes {

    enum Color { RED, GREEN, BLUE }

    public static void main(String[] args) {

        // 1. byte
        byte byteVal = 2;
        switch(byteVal) {
            case 1: System.out.println("byte: 1"); break;
            case 2: System.out.println("byte: 2"); break;
        }

        // 2. short
        short shortVal = 3;
        switch(shortVal) {
            case 3: System.out.println("short: 3"); break;
        }

        // 3. int
        int intVal = 100;
        switch(intVal) {
            case 100: System.out.println("int: 100"); break;
        }

        // 4. char
        char charVal = 'Z';
        switch(charVal) {
            case 'Z': System.out.println("char: Z"); break;
        }

        // 5. Integer (поддерживает обёртки целочисленных типов)
        Integer integerVal = 50;
        switch(integerVal) {
            case 50: System.out.println("Integer: 50"); break;
        }

        // 6. String
        String strVal = "HELLO";
        switch(strVal) {
            case "HELLO": System.out.println("String: HELLO"); break;
        }

        // 7. enum (перечисления)
        Color colorVal = Color.GREEN;
        switch(colorVal) {
            case RED: System.out.println("RED"); break;
            case GREEN: System.out.println("GREEN"); break;
        }
    }
}
