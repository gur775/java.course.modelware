// Первый интерфейс с default методом
interface A {
    default void print() {
        System.out.println("Метод из интерфейса A");
    }
}

// Второй интерфейс с таким же default методом
interface B {
    default void print() {
        System.out.println("Метод из интерфейса B");
    }
}

// Произойдёт ошибка компиляции
// Класс не знает, какой метод выбрать
class MyClass implements A, B {
    // Ошибка: MyClass inherits unrelated defaults for print()

    // нужно переопределить метод явно
    @Override
    public void print() {
        // своя реализация
        System.out.println("реализация");

        // или вызвать метод из конкретного интерфейса
        A.super.print();  // вызов метода из A
        B.super.print();  // вызов метода из B
    }
}

// Правильное решение конфликта
class Solution implements A, B {
    @Override
    public void print() {
        // Вызываем метод из интерфейса A
        A.super.print();
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.print(); // "Метод из интерфейса A"
    }
}
