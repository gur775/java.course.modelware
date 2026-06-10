package other;

import demo.Access;

public class SubclassInDifferentPackage extends Access {
    public void testAccess() {
        System.out.println("\n=== Доступ из наследника в другом пакете ===");

        System.out.println(publicVar);
        System.out.println(protectedVar);
        // System.out.println(defaultVar); // Ошибка при компиляции
        // System.out.println(privateVar); // Ошибка при компиляции

        publicMethod();
        protectedMethod();
        // defaultMethod(); // Недоступен
        // privateMethod(); // Недоступен
    }

    public static void main(String[] args) {
        SubclassInDifferentPackage obj = new SubclassInDifferentPackage();
        obj.testAccess();
    }
}
