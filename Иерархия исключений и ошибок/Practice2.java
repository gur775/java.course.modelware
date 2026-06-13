public class Practice2 {
    public static void main(String[] args) {

        // ArithmeticException
        System.out.println("ArithmeticException");
        try {
            int result = 15 / 0; // деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // ArrayIndexOutOfBoundsException
        System.out.println("\nArrayIndexOutOfBoundsException");
        try {
            int[] arr = new int[3];
            int x = arr[5]; // индекс 5 вне диапазона (0-2)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: индекс вне границ массива");
        }

        // IllegalArgumentException
        System.out.println("\nIllegalArgumentException");
        try {
            setAge(-5); // отрицательный возраст
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // ClassCastException
        System.out.println("\nClassCastException");
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj; // String нельзя привести к Integer
        } catch (ClassCastException e) {
            System.out.println("Ошибка: некорректное приведение типов");
        }

        //NullPointerException
        System.out.println("\nNullPointerException");
        try {
            String str = null;
            int length = str.length(); // вызов метода у null
        } catch (NullPointerException e) {
            System.out.println("Ошибка: обращение к null-ссылке");
        }
    }

    // Метод, генерирующий IllegalArgumentException
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным: " + age);
        }
        System.out.println("Возраст: " + age);
    }
}
