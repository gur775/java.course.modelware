package demo;

public class SamePackageTest {
    public static void main(String[] args) {
        Access obj = new Access();

        System.out.println("=== Доступ из того же пакета ===");

        System.out.println(obj.publicVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.defaultVar);
        // System.out.println(obj.privateVar); // Ошибка при компиляции

        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        // obj.privateMethod(); // Ошибка при компиляции
    }
}
