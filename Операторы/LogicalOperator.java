public class LogicalOperator {
    public static void main(String[] args) {
        boolean t = true, f = false;

        // || логическое ИЛИ
        System.out.println("true || false = " + (t || f));  // true
        System.out.println("false || false = " + (f || f));  // false

        // && логическое И
        System.out.println("true && false = " + (t && f));  // false
        System.out.println("true && true = " + (t && t));  // true

        // Демонстрация короткого замыкания
        int x = 10;
        if (false && (x++ > 0)) {  // (x++ > 0) не выполнится
            System.out.println("Не выполнится");
        }
        System.out.println("x после &&: " + x);  // 10

        if (true || (x++ > 0)) {  // (x++ > 0) не выполнится
            System.out.println("Выполнится");
        }
        System.out.println("x после ||: " + x);  // 10
    }
}
