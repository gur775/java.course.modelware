public class Practice1 {
    // Поля класса для ссылочных типов (по умолчанию null)
    static String strDefault;
    static Integer integerDefault;
    static int[] arrayDefault;

    public static void main(String[] args) {

        // Примитивные типы (не могут быть null)
        byte b = 0;
        short s = 0;
        int i = 0;
        long l = 0L;
        float f = 0.0f;
        double d = 0.0;
        char c = '\u0000';  // нулевой символ
        boolean bool = false;

        System.out.println("Примитивные типы (не могут быть null)");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: '" + c + "' (код: " + (int)c + ")");
        System.out.println("boolean: " + bool);

        // Ссылочные типы (могут быть null)
        System.out.println("\nСсылочные типы (могут быть null)");
        String str = null;
        Integer integer = null;
        Double doubleObj = null;
        Boolean booleanObj = null;
        int[] array = null;
        Object obj = null;

        System.out.println("String: " + str);
        System.out.println("Integer: " + integer);
        System.out.println("Double: " + doubleObj);
        System.out.println("Boolean: " + booleanObj);
        System.out.println("int[]: " + array);
        System.out.println("Object: " + obj);

        // Значения по умолчанию для полей класса
        System.out.println("\nЗначения по умолчанию (поля класса)");
        System.out.println("String field: '" + strDefault + "'");
        System.out.println("Integer field: " + integerDefault);
        System.out.println("int[] field: " + arrayDefault);
    }
}
