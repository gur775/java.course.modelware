public class Practice2 {
    public static void main(String[] args) {
        // Исходные объекты
        String str = "Hello";
        StringBuffer sbf = new StringBuffer("World");
        StringBuilder sbd = new StringBuilder("Java");

        System.out.println("Исходные объекты:");
        System.out.println("  String: " + str);
        System.out.println("  StringBuffer: " + sbf);
        System.out.println("  StringBuilder: " + sbd);

        // Преобразование в String
        System.out.println("\nВ String");

        // Из StringBuffer в String
        String fromStringBuffer = sbf.toString();
        System.out.println("  StringBuffer → String: " + fromStringBuffer);

        // Из StringBuilder в String
        String fromStringBuilder = sbd.toString();
        System.out.println("  StringBuilder → String: " + fromStringBuilder);

        //Преобразование в StringBuffer
        System.out.println("\nВ StringBuffer");

        // Из String в StringBuffer
        StringBuffer fromString = new StringBuffer(str);
        System.out.println("  String → StringBuffer: " + fromString);

        // Из StringBuilder в StringBuffer
        StringBuffer fromStringBuilder2 = new StringBuffer(sbd.toString());
        System.out.println("  StringBuilder → StringBuffer: " + fromStringBuilder2);

        // Преобразование в StringBuilder
        System.out.println("\n3. В StringBuilder");

        // StringBuffer → StringBuilder через append
        StringBuilder sbFromBuffer = new StringBuilder();
        sbFromBuffer.append(sbf);
        System.out.println("  StringBuffer → StringBuilder (append): " + sbFromBuffer);

        // StringBuilder → StringBuffer через append
        StringBuffer sbfFromBuilder = new StringBuffer();
        sbfFromBuilder.append(sbd);
        System.out.println("  StringBuilder → StringBuffer (append): " + sbfFromBuilder);
    }
}