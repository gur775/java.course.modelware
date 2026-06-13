public class Practice3 {

    class Inner {
        private int privateField = 1;
        public int publicField = 2;
        protected int protectedField = 3;
        int defaultField = 4;

        private void privateMethod() {
            System.out.println("Inner private method");
        }

        public void publicMethod() {
            System.out.println("Inner public method");
        }
    }

    // Внешний класс имеет доступ ко всем членам внутреннего класса
    // Не зависит от их спецификаторов
    public void accessInner() {
        Inner inner = new Inner();

        // Доступ ко всем полям
        System.out.println("privateField: " + inner.privateField);   // +
        System.out.println("publicField: " + inner.publicField);     // +
        System.out.println("protectedField: " + inner.protectedField); // +
        System.out.println("defaultField: " + inner.defaultField);   // +

        // Доступ ко всем методам
        inner.privateMethod();  // +
        inner.publicMethod();   // +
    }
}

// Другой класс (не внешний) - доступ ограничен спецификаторами
class OtherClass {
    public void test() {
        Practice3 outer = new Practice3();
        Practice3.Inner inner = outer.new Inner();

        // Доступны только public
        System.out.println(inner.publicField);    // +
        inner.publicMethod();                     // +

        // private, protected, default - не доступны
        // System.out.println(inner.privateField); // ошибка
        // System.out.println(inner.protectedField); // ошибка
        // System.out.println(inner.defaultField); // ошибка
        // inner.privateMethod(); // ошибка
    }
}
