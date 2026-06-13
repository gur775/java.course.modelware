// final-класс - от него нельзя наследоваться
final class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println(brand + " запущен");
    }
}

// Попытка наследования от final-класса вызовет ошибку
/*
class Car extends Vehicle {  // Ошибка
    public Car(String brand) {
        super(brand);
    }
}
*/

// Обычный класс - от него можно наследоваться
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota");
        vehicle.start(); // "Toyota запущен"

        // Нельзя создать подкласс Vehicle
        // Car car = new Car("BMW"); // Ошибка

        Dog dog = new Dog("Собака10");
        System.out.println("Собака: " + dog.name);
    }
}
