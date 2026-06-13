// Проверяемое исключение (наследуется от Exception)
class InsufficientFundsException extends Exception {

    private double deficitAmount; // дополнительное поле

    // Конструктор без параметров
    public InsufficientFundsException() {
        super("Недостаточно средств на счете");
    }

    // Конструктор с сообщением
    public InsufficientFundsException(String message) {
        super(message);
    }

    // Конструктор с сообщением и причиной
    public InsufficientFundsException(String message, Throwable cause) {
        super(message, cause);
    }

    // Конструктор с суммой недостачи
    public InsufficientFundsException(double deficitAmount) {
        super("Недостаточно средств. Не хватает: " + deficitAmount + " руб.");
        this.deficitAmount = deficitAmount;
    }

    // Дополнительный метод
    public double getDeficitAmount() {
        return deficitAmount;
    }
}

// Непроверяемое исключение (наследуется от RuntimeException)
class InvalidAgeException extends RuntimeException {

    public InvalidAgeException(String message) {
        super(message);
    }
}

// Использование собственных исключений
public class BankAccountException {
    private double balance;

    public BankAccountException(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            double deficit = amount - balance;
            throw new InsufficientFundsException(deficit);
        }
        balance -= amount;
        System.out.println("Снято " + amount + " руб. Остаток: " + balance);
    }

    public static void main(String[] args) {
        BankAccountException account = new BankAccountException(1000);

        try {
            account.withdraw(1500); // выбросит исключение
        } catch (InsufficientFundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println("Сумма недостачи: " + e.getDeficitAmount());
        }

        // Непроверяемое исключение
        throw new InvalidAgeException("Возраст не может быть отрицательным");
    }
}
