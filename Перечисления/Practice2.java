enum Operation {
    PLUS("+") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    MULTIPLY("*") {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        @Override
        public double apply(double x, double y) {
            if (y == 0) {
                throw new ArithmeticException("Деление на ноль");
            }
            return x / y;
        }
    };

    private String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    // Абстрактный метод, который реализует каждый элемент
    public abstract double apply(double x, double y);

    // Дополнительный метод
    public static Operation fromSymbol(String symbol) {
        for (Operation op : values()) {
            if (op.symbol.equals(symbol)) {
                return op;
            }
        }
        throw new IllegalArgumentException("Неизвестная операция: " + symbol);
    }
}

public class Practice2 {
    public static void main(String[] args) {
        double a = 100, b = 28;

        for (Operation op : Operation.values()) {
            System.out.println(a + " " + op.getSymbol() + " " + b +
                    " = " + op.apply(a, b));
        }

        // Использование дополнительного метода
        Operation op = Operation.fromSymbol("*");
        System.out.println("Результат: " + op.apply(7, 3));
    }
}
