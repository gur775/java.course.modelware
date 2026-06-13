class Parent {
    protected int value = 100;

    public Parent() {
        System.out.println("Конструктор Parent");
    }

    public Parent(String message) {
        System.out.println("Конструктор Parent: " + message);
    }

    public void display() {
        System.out.println("Метод display() из Parent");
    }
}

class Child extends Parent {
    int value = 200;

    public Child() {
        // Вызов конструктора родительского класса
        super(); // вызов конструктора Parent без параметров
        System.out.println("Конструктор Child");
    }

    public Child(String msg) {
        // Вызов конструктора родительского класса с параметром
        super(msg);
        System.out.println("Конструктор Child: " + msg);
    }

    public void display() {
        // Вызов метода родительского класса
        super.display();
        System.out.println("Метод display() из Child");
    }

    public void showValues() {
        int value = 300;
        System.out.println("Локальная переменная value: " + value);
        System.out.println("Поле текущего класса this.value: " + this.value);
        // Доступ к полю родительского класса
        System.out.println("Поле родительского класса super.value: " + super.value);
    }
}

public class Practice1 {
    public static void main(String[] args) {

        System.out.println("вызов конструктора родителя");
        Child child1 = new Child();

        System.out.println("\nвызов конструктора родителя с параметром");
        Child child2 = new Child("Привет");

        System.out.println("\nвызов метода родителя");
        child1.display();

        System.out.println("\nдоступ к полю родителя");
        child1.showValues();
    }
}
