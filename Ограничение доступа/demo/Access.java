package demo;

public class Access {

    // Поля с разными модификаторами
    public String publicVar = "public";
    protected String protectedVar = "protected";
    String defaultVar = "default (package-private)";
    private String privateVar = "private";

    // Методы с разными модификаторами
    public void publicMethod() {
        System.out.println("public метод");
        // Внутри класса видны все
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        System.out.println(privateVar);
    }

    protected void protectedMethod() {
        System.out.println("protected метод");
    }

    void defaultMethod() {
        System.out.println("default метод");
    }

    private void privateMethod() {
        System.out.println("private метод");
    }

    public void demonstrateInsideClass() {
        System.out.println("\n=== Доступ внутри того же класса ===");
        privateMethod();  // Доступен
        defaultMethod();  // Доступен
        protectedMethod(); // Доступен
        publicMethod();   // Доступен
    }
}


