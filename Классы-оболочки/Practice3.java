public class Practice3 {
    public static void main(String[] args) {

        // Распаковка null-объекта
        Integer nullInteger = null;

        // Будет NPE при распаковке в int
        try {
            int primitive = nullInteger; // null.intValue() → NPE
        } catch (NullPointerException e) {
            System.out.println("NPE при распаковке: " + e);
        }

        // Распаковка в арифметической операции
        Integer a = null;
        Integer b = 12;

        try {
            int sum = a + b; // распаковка a → NPE
        } catch (NullPointerException e) {
            System.out.println("NPE при арифметической операции: " + e);
        }

        // Распаковка при сравнении
        Integer c = null;

        try {
            if (c > 5) { // распаковка c → NPE
                System.out.println("Больше");
            }
        } catch (NullPointerException e) {
            System.out.println("NPE при сравнении: " + e);
        }

        // проверка на null
        Integer safe = null;
        if (safe != null) {
            int value = safe; // безопасно
        }
    }
}
