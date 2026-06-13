// Интерфейс с default (неабстрактным) и static методами
interface Greeting {

    // Абстрактный метод
    void sayHello();

    // Неабстрактный (default) метод
    default void sayGoodbye() {
        System.out.println("До свидания");
    }

    // Статический метод
    static void sayWelcome() {
        System.out.println("Добро пожаловать");
    }
}

// Класс, реализующий интерфейс
class RussianPerson implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Привет");
    }

    // Можем переопределить default метод
    @Override
    public void sayGoodbye() {
        System.out.println("Пока");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        RussianPerson person = new RussianPerson();

        // вызов через объект класса
        person.sayHello();      // "Привет"
        person.sayGoodbye();    // "Пока" (переопределённый)

        // вызов через ссылку на интерфейс
        Greeting greeting = new RussianPerson();
        greeting.sayHello();    // "Привет"
        greeting.sayGoodbye();  // "Пока"

        // вызов статического метода (только через интерфейс)
        Greeting.sayWelcome();  // "Добро пожаловать"

        // нельзя вызвать статический метод через объект
        // person.sayWelcome(); // ошибка
    }
}
