public class Practice8 {
    public static void main(String[] args) {

        // var - локальная переменная с выводом типа
        // Тип определяется компилятором по значению

        // Примитивные типы
        var number = 10;        // int
        var decimal = 3.14;     // double
        var flag = true;        // boolean
        var letter = 'A';       // char

        // Ссылочные типы
        var text = "Hello";     // String
        var list = new java.util.ArrayList<String>(); // ArrayList<String>
        var map = new java.util.HashMap<Integer, String>(); // HashMap<Integer, String>

        // В циклах
        var numbers = new int[]{1, 2, 3, 4, 5};
        for (var num : numbers) {  // int
            System.out.print(num + " ");
        }

        // С анонимными классами
        var obj = new Object() {
            void customMethod() {
                System.out.println("Custom method");
            }
        };
        obj.customMethod();

        // Ограничения var:
        // Только для локальных переменных
        // Должна быть инициализирована
        // Нельзя использовать null без указания типа
        // var x;              // ошибка
        // var y = null;       // неопределённый тип
        var z = (String) null;  // явное указание типа
    }
}
