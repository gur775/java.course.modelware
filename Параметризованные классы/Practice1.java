import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    public static void main(String[] args) {

        System.out.println("instanceof и параметризованные типы\n");

        // нельзя проверить конкретный параметр типа
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        // Ошибка компиляции
        // if (stringList instanceof List<String>) { }

        // Можно проверять только "сырой" тип (raw type)
        if (stringList instanceof List) {
            System.out.println("stringList instanceof List: true");
        }

        // Можно проверять с wildcard (но стирание типов)
        if (stringList instanceof List<?>) {
            System.out.println("stringList instanceof List<?>: true");
        }

        // Проверка с параметризованным классом, но без конкретного типа
        List<?> unknownList = stringList;
        if (unknownList instanceof List) {
            System.out.println("unknownList instanceof List: true");
        }

        System.out.println("\nбезопасное приведение");

        Object obj = new ArrayList<String>();

        // Проверяем, является ли объект List
        if (obj instanceof List) {
            // Приводим к сырому типу
            List<?> list = (List<?>) obj;
            System.out.println("Объект успешно приведён к List<?>");

            // Не можем узнать тип элементов
            System.out.println("   Размер списка: " + list.size());
        }

        // Пример с пользовательским параметризованным классом
        System.out.println("\nПользовательский параметризованный класс");

        Box<String> stringBox = new Box<>("Привет");
        Box<Integer> integerBox = new Box<>(123);

        // Проверка с сырым типом работает
        System.out.println("stringBox instanceof Box: " + (stringBox instanceof Box));
        System.out.println("integerBox instanceof Box: " + (integerBox instanceof Box));

        // Нельзя проверить Box<String>
        // System.out.println(stringBox instanceof Box<String>);

        // Метод, демонстрирующий проблему
        checkAndProcess(stringBox);
        checkAndProcess(integerBox);
    }

    public static void checkAndProcess(Object obj) {
        // Единственный способ - проверять сырой тип
        if (obj instanceof Box) {
            Box<?> box = (Box<?>) obj;
            System.out.println("Обработка Box с содержимым: " + box.getContent());
        }
    }
}

class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
