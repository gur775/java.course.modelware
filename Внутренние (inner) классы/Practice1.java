public class Practice1 {

    // public - доступен везде
    public class PublicInner {
        public void show() {
            System.out.println("PublicInner");
        }
    }

    // private - доступен только внутри Practice1
    private class PrivateInner {
        public void show() {
            System.out.println("PrivateInner");
        }
    }

    // protected - доступен в пакете и подклассах
    protected class ProtectedInner {
        public void show() {
            System.out.println("ProtectedInner");
        }
    }

    // default (package-private) - доступен только в пакете
    class DefaultInner {
        public void show() {
            System.out.println("DefaultInner");
        }
    }

    public void testAccess() {
        // Внутри внешнего класса доступны все
        PublicInner pi = new PublicInner();
        PrivateInner pri = new PrivateInner();
        ProtectedInner proi = new ProtectedInner();
        DefaultInner di = new DefaultInner();

        pi.show();
        pri.show();
        proi.show();
        di.show();
    }
}

// В том же пакете
class SamePackageTest {
    public void test() {
        Practice1 outer = new Practice1();

        // Доступны public, protected, default
        Practice1.PublicInner pi = outer.new PublicInner();
        Practice1.ProtectedInner proi = outer.new ProtectedInner();
        Practice1.DefaultInner di = outer.new DefaultInner();

        // private - не доступен
        // Practice1.PrivateInner pri = outer.new PrivateInner(); // ошибка
    }
}
