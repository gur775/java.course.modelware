public class Calculator {
    // Перегрузка по количеству параметров
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Перегрузка по типу параметров
    public double add(double a, double b) {
        return a + b;
    }

    // Перегрузка по порядку параметров
    public String add(String a, int b) {
        return a + b;
    }

    public String add(int a, String b) {
        return a + b;
    }
}

// Использование
Calculator calc = new Calculator();
calc.add(2, 3);           // 5
calc.add(2, 3, 4);        // 9
calc.add(2.5, 3.7);       // 6.2
calc.add("Число: ", 58);  // "Число: 42"


