// Интерфейс со вложенным классом
interface Vehicle {

    // Вложенный класс внутри интерфейса
    class Engine {
        private String type;

        public Engine(String type) {
            this.type = type;
        }

        public void start() {
            System.out.println("Двигатель " + type + " запущен");
        }

        public void stop() {
            System.out.println("Двигатель остановлен");
        }
    }

    // Абстрактные методы интерфейса
    void drive();
}

// Реализация интерфейса
class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Машина едет");
    }
}

public class Practice1 {
    public static void main(String[] args) {

        // Создание объекта вложенного класса через интерфейс
        Vehicle.Engine engine1 = new Vehicle.Engine("Бензиновый");
        engine1.start(); // "Двигатель Бензиновый запущен"
        engine1.stop();  // "Двигатель остановлен"

        // Создание объекта и вызов методов
        Vehicle.Engine engine2 = new Vehicle.Engine("Дизельный");
        engine2.start(); // "Двигатель Дизельный запущен"

        // В цепочке вызовов
        new Vehicle.Engine("Электрический").start(); // "Двигатель Электрический запущен"

        // Использование вместе с реализацией интерфейса
        Car car = new Car();
        car.drive(); // "Машина едет"

        Vehicle.Engine carEngine = new Vehicle.Engine("Гибридный");
        carEngine.start();
    }
}
