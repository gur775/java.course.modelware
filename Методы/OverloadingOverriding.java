
class Calculator {

    // Перегрузка по количеству параметров
    public int add(int a, int b) {
        System.out.print("add(int, int): ");
        return a + b;
    }

    public int add(int a, int b, int c) {
        System.out.print("add(int, int, int): ");
        return a + b + c;
    }

    // Перегрузка по типу параметров
    public double add(double a, double b) {
        System.out.print("add(double, double): ");
        return a + b;
    }

    // Перегрузка по порядку параметров
    public String add(String a, int b) {
        System.out.print("add(String, int): ");
        return a + b;
    }

    public String add(int a, String b) {
        System.out.print("add(int, String): ");
        return a + b;
    }

    // Перегрузка метода area (разные фигуры)
    public double area(double radius) {
        System.out.print("area(круг): ");
        return Math.PI * radius * radius;
    }

    public double area(double length, double width) {
        System.out.print("area(прямоугольник): ");
        return length * width;
    }

    public double area(int side) {
        System.out.print("area(квадрат): ");
        return side * side;
    }

    public double area(double base, double height, boolean isTriangle) {
        System.out.print("area(треугольник): ");
        return 0.5 * base * height;
    }
}

//Переопределение
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Метод для переопределения
    public void makeSound() {
        System.out.println(name + " издаёт звук");
    }

    // Метод для переопределения
    public void move() {
        System.out.println(name + " двигается");
    }

    // Метод для переопределения
    public String getInfo() {
        return "Животное: " + name;
    }

    // Метод, который нельзя переопределить (final)
    public final void breathe() {
        System.out.println(name + " дышит");
    }

}

// Дочерний класс
class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    // Переопределение метода makeSound()
    @Override
    public void makeSound() {
        System.out.println(name + " гавкает");
    }

    // Переопределение метода move()
    @Override
    public void move() {
        System.out.println(name + " бегает на четырёх лапах");
    }

    // Переопределение метода getInfo() с вызовом родительского метода
    @Override
    public String getInfo() {
        return super.getInfo() + " Собака";
    }

    // Свой уникальный метод
    public void wagTail() {
        System.out.println(name + " виляет хвостом");
    }
}

// Дочерний класс 2
class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " мяукает");
    }

    @Override
    public void move() {
        System.out.println(name + " крадётся");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Кошка";
    }

    public void climb() {
        System.out.println(name + " забирается на дерево");
    }
}

public class OverloadingOverriding {
    public static void main(String[] args) {

        System.out.println("Перегрузка\n");

        Calculator calc = new Calculator();

        System.out.println("Перегрузка по количеству параметров");
        System.out.println("  2 + 3 = " + calc.add(2, 3));
        System.out.println("  2 + 3 + 4 = " + calc.add(2, 3, 4));

        System.out.println("\nПерегрузка по типу параметров");
        System.out.println("  2.5 + 3.7 = " + calc.add(2.5, 3.7));
        System.out.println("  2 + 3 = " + calc.add(2, 3));

        System.out.println("\nПерегрузка по порядку параметров");
        System.out.println("  \"Число: \" + 42 = " + calc.add("Число: ", 42));
        System.out.println("  42 + \" - ответ\" = " + calc.add(42, " - ответ"));

        System.out.println("\nПерегрузка метода area для разных фигур");
        System.out.println("  Круг (r=5): " + String.format("%.2f", calc.area(5.0)));
        System.out.println("  Прямоугольник (5x3): " + calc.area(5.0, 3.0));
        System.out.println("  Квадрат (сторона=4): " + calc.area(4));
        System.out.println("  Треугольник (осн=6, выс=4): " + calc.area(6.0, 4.0, true));

        System.out.println("\nПереопределение\n");

        // Полиморфное поведение
        Animal[] animals = {
                new Dog("Собака1"),
                new Cat("Кошка1"),
                new Animal("Кто-то")  // обычное животное
        };

        System.out.println("Полиморфное поведение при переопределении\n");
        for (Animal animal : animals) {
            System.out.println("--- " + animal.getInfo() + " ---");
            animal.makeSound();
            animal.move();
            animal.breathe();  // final метод - нельзя переопределить
            System.out.println();
        }

        // Вызов специфичных методов
        System.out.println("Специфичные методы дочерних классов");
        Dog dog = new Dog("Собака2");
        dog.wagTail();

        Cat cat = new Cat("Кошка2");
        cat.climb();
    }
}
