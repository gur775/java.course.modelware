enum DayOfWeek {
    // Элементы перечисления с инициализацией
    MONDAY("Понедельник", 1),
    TUESDAY("Вторник", 2),
    WEDNESDAY("Среда", 3),
    THURSDAY("Четверг", 4),
    FRIDAY("Пятница", 5),
    SATURDAY("Суббота", 6),
    SUNDAY("Воскресенье", 7);

    // Поля
    private String russianName;
    private int number;

    // Конструктор (вызывается для каждого элемента)
    DayOfWeek(String russianName, int number) {
        this.russianName = russianName;
        this.number = number;
    }

    // Геттеры
    public String getRussianName() {
        return russianName;
    }

    public int getNumber() {
        return number;
    }
}

public class Practice1 {
    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day + " - " + day.getRussianName() +
                    " (номер " + day.getNumber() + ")");
        }
    }
}
