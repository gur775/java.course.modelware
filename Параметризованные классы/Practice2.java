import java.util.ArrayList;
import java.util.List;

public class Practice2 {
    public static void main(String[] args) {

        System.out.println("<? extends T> и <? super T>\n");

        // Подготовка данных
        List<Animal> animals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<Labrador> labradors = new ArrayList<>();

        animals.add(new Animal("Животное"));
        dogs.add(new Dog("Собака"));
        labradors.add(new Labrador("Лабрадор"));

        System.out.println("<? extends T> (Producer Extends)");
        System.out.println("Назначение: чтение данных из коллекции");

        // Метод, который читает из списка животных и их потомков
        readAnimals(animals);
        readAnimals(dogs);     // Dog extends Animal - можно
        readAnimals(labradors); // Labrador extends Dog extends Animal - можно

        System.out.println("\n<? super T> (Consumer Super)");
        System.out.println("Назначение: запись данных в коллекцию");

        // Метод, который добавляет собак в коллекцию
        addDogs(animals);   // Animal - super Dog - можно
        addDogs(dogs);      // Dog - super Dog - можно
        // addDogs(labradors); // ошибка. Labrador не super Dog

        System.out.println("\nPECS правило (Producer Extends, Consumer Super)");

        // Producer - читаем, используем extends
        // Consumer - пишем, используем super
        copy(labradors, animals); // копируем из extends в super
    }

    // <? extends Animal> - читаем элементы как Animal
    public static void readAnimals(List<? extends Animal> animals) {
        // Можно читать
        Animal a = animals.get(0);
        System.out.println("  Читаем: " + a.getName());

        // нельзя добавлять (кроме null)
        // animals.add(new Animal("Кто-то")); // ошибка
        // animals.add(new Dog("Рекс"));     // ошибка
        animals.add(null); // только null разрешён
    }

    // <? super Dog> - можем добавлять Dog и его потомков
    public static void addDogs(List<? super Dog> container) {
        // Можно добавлять Dog и его подклассы
        container.add(new Dog("Новая собака"));
        container.add(new Labrador("Новый лабрадор"));

        // нельзя гарантировать тип при чтении
        // Dog dog = container.get(0); // ошибка - может быть Animal
        Object obj = container.get(0); // только Object гарантирован
        System.out.println("  Добавлены собаки в контейнер");
    }

    // PECS: Producer = extends, Consumer = super
    public static void copy(List<? extends Dog> src, List<? super Dog> dest) {
        for (Dog dog : src) {     // читаем из extends
            dest.add(dog);         // пишем в super
        }
        System.out.println("  Копирование завершено");
    }
}

// Иерархия классов
class Animal {
    protected String name;
    public Animal(String name) { this.name = name; }
    public String getName() { return name; }
}

class Dog extends Animal {
    public Dog(String name) { super(name); }
}

class Labrador extends Dog {
    public Labrador(String name) { super(name); }
}
