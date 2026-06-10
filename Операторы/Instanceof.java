class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class Instanceof {
    public static void main(String[] args) {

        // С классами
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));  // true
        System.out.println("str instanceof Object: " + (str instanceof Object));  // true

        // С наследованием
        Dog dog = new Dog();
        Animal animal = new Animal();
        Animal dogAsAnimal = new Dog();

        System.out.println("\n--- Наследование ---");
        System.out.println("dog instanceof Dog: " + (dog instanceof Dog));          // true
        System.out.println("dog instanceof Animal: " + (dog instanceof Animal));    // true
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog));    // false
        System.out.println("dogAsAnimal instanceof Dog: " + (dogAsAnimal instanceof Dog));    // true
        System.out.println("dogAsAnimal instanceof Animal: " + (dogAsAnimal instanceof Animal)); // true

        // С интерфейсами
        String text = "Java";
        System.out.println("\n--- Интерфейсы ---");
        System.out.println("text instanceof CharSequence: " + (text instanceof CharSequence));  // true
        System.out.println("text instanceof Comparable: " + (text instanceof Comparable));      // true

        // С объектами-обертками
        Integer num = 25;
        System.out.println("\n--- Обертки ---");
        System.out.println("num instanceof Integer: " + (num instanceof Integer));  // true
        System.out.println("num instanceof Number: " + (num instanceof Number));    // true

        // С null-объектом
        System.out.println("\n=== null ОБЪЕКТ ===\n");

        String nullString = null;
        System.out.println("nullString instanceof String: " + (nullString instanceof String));  // false
        System.out.println("nullString instanceof Object: " + (nullString instanceof Object));  // false

        // Любая проверка instanceof для null всегда возвращает false
        Dog nullDog = null;
        System.out.println("nullDog instanceof Dog: " + (nullDog instanceof Dog));  // false
        System.out.println("nullDog instanceof Animal: " + (nullDog instanceof Animal));  // false

    }
}
