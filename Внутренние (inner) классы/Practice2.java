public class Practice2 {
    private int privateField = 10;
    public int publicField = 20;
    protected int protectedField = 30;
    int defaultField = 40;

    private void privateMethod() {
        System.out.println("Private method");
    }

    public void publicMethod() {
        System.out.println("Public method");
    }

    // Внутренний класс имеет доступ ко всем полям и методам внешнего
    // Не зависит от их спецификаторов доступа
    class Inner {
        public void accessPractice2() {
            // Доступ ко всем полям
            System.out.println("privateField: " + privateField);   // +
            System.out.println("publicField: " + publicField);     // +
            System.out.println("protectedField: " + protectedField); // +
            System.out.println("defaultField: " + defaultField);   // +

            // Доступ ко всем методам
            privateMethod();  // +
            publicMethod();   // +
        }
    }

    // Статический внутренний класс имеет ограниченный доступ
    static class StaticInner {
        public void accessPractice2() {
            // Нет доступа к нестатическим полям!
            // System.out.println(privateField); // ошибка

            // Можно создать экземпляр Practice2
            Practice2 outer = new Practice2();
            System.out.println(outer.privateField); // + через объект
        }
    }
}
