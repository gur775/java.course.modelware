// Базовый класс
class Bird {
    public void move() {
        System.out.println("Птица перемещается");
    }
}

// Подкласс, который соблюдает LSP
class Sparrow extends Bird {
    @Override
    public void move() {
        System.out.println("Воробей летает");
    }
}

// Ещё один корректный подкласс
class Penguin extends Bird {
    @Override
    public void move() {
        System.out.println("Пингвин плавает"); // тоже перемещается, но по-другому
    }
}

// Демонстрация LSP
public class LSP {
    public static void main(String[] args) {
        // Подстановка: везде, где ожидается Bird, можно передать Sparrow или Penguin

        Bird bird1 = new Sparrow();
        Bird bird2 = new Penguin();

        makeBirdMove(bird1); // "Воробей летает"
        makeBirdMove(bird2); // "Пингвин плавает"
    }

    // Метод работает с любым Bird
    public static void makeBirdMove(Bird bird) {
        bird.move(); // не важно, какой именно подкласс
    }
}
