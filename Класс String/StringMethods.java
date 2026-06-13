public class StringMethods {
    public static void main(String[] args) {
        String str = "  Hello, World!  ";
        String str2 = "Java Programming";

        // 1. length() - возвращает длину строки
        System.out.println("1. length(): " + str.length());

        // 2. charAt() - возвращает символ по указанному индексу
        System.out.println("2. charAt(7): " + str.charAt(7));

        // 3. substring() - извлекает подстроку
        System.out.println("3. substring(7, 12): " + str.substring(7, 12));

        // 4. trim() - удаляет начальные и конечные пробелы
        System.out.println("4. trim(): '" + str.trim() + "'");

        // 5. toUpperCase() / toLowerCase() - делает регистра большим/маленьким
        System.out.println("5. toUpperCase(): " + str2.toUpperCase());
        System.out.println("   toLowerCase(): " + str2.toLowerCase());

        // 6. indexOf() - поиск первого вхождения подстроки
        System.out.println("6. indexOf('World'): " + str.indexOf("World"));

        // 7. replace() - замена символов или подстрок
        System.out.println("7. replace('o', '0'): " + str2.replace('o', '0'));

        // 8. contains() - проверяет наличие подстроки
        System.out.println("8. contains('Java'): " + str2.contains("Java"));

        // 9. split() - разделяет строку на массив подстрок
        String[] words = str2.split(" ");
        System.out.println("9. split(' '): " + words[0] + " и " + words[1]);

        // 10. equals() / equalsIgnoreCase() - сравнение строк
        String str3 = "java programming";
        System.out.println("10. equalsIgnoreCase(): " + str2.equalsIgnoreCase(str3));
    }
}
