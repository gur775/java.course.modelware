package other;

import demo.Access;

public class DifferentPackageTest {
    public static void main(String[] args) {
        Access obj = new Access();

        System.out.println("=== Доступ из другого пакета (не наследник) ===");

        System.out.println(obj.publicVar); //Доступен
        // System.out.println(obj.protectedVar);  // Недоступен
        // System.out.println(obj.defaultVar);    // Недоступен
        // System.out.println(obj.privateVar);    // Недоступен

        obj.publicMethod();
        // obj.protectedMethod();  // Ошибка при компиляции
        // obj.defaultMethod();    // Ошибка при компиляции
        // obj.privateMethod();    // Ошибка при компиляции
    }
}
