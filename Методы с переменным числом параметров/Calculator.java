class Calculator {

    /**
     * Базовые математические операции с переменным числом параметров
     */

    // Сложение любого количества чисел
    public double add(double... numbers) {
        double result = 0;
        for (double num : numbers) {
            result += num;
        }
        return result;
    }

    // умножение любого количества чисел
    public double multiply(double... numbers) {
        if (numbers.length == 0) return 0;
        double result = 1;
        for (double num : numbers) {
            result *= num;
        }
        return result;
    }

    // нахождение минимального значения
    public double min(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Нет данных");
        }
        double min = numbers[0];
        for (double num : numbers) {
            if (num < min) min = num;
        }
        return min;
    }

    // операция с целыми числами
    public int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Сложение (double): " + calc.add(1.5, 2.5, 3.0, 10.0));
        System.out.println("Сложение (int): " + calc.add(10, 20, 30, 40, -5, 0));
        System.out.println("Умножение: " + calc.multiply(2, 3, 4, 99));
        System.out.println("Минимум: " + calc.min(5.6, 2.3, 8.9, 1.2, 0.01));
    }
}
