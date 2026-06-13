class Animal {
    // Обычный метод - можно переопределить
    public void makeSound() {
        System.out.println("Животное издаёт звук");
    }

    // final-метод - нельзя переопределить в подклассе
    public final void breathe() {
        System.out.println("Животное дышит");
    }
}

class Dog extends Animal {

    // Это работает - переопределение обычного метода
    @Override
    public void makeSound() {
        System.out.println("Собака гавкает");
    }

    // Это вызовет ошибку компиляции
    // Нельзя переопределить final-метод
    /*
    @Override
    public void breathe() {
        System.out.println("Собака дышит"); // Ошибка
    }
    */
}

public class Practice1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // "Собака гавкает"
        dog.breathe();   // "Животное дышит" (метод суперкласса)
    }
}
