import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Practice3 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        // Год (4 цифры)
        DateTimeFormatter yearFormatter = DateTimeFormatter.ofPattern("yyyy");
        System.out.println("Год: " + now.format(yearFormatter));

        // Полное название месяца
        DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("MMMM");
        System.out.println("Месяц: " + now.format(monthFormatter));

        // День недели
        DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("EEEE");
        System.out.println("День недели: " + now.format(dayFormatter));

        // Час в 24-часовом формате
        DateTimeFormatter hourFormatter = DateTimeFormatter.ofPattern("HH");
        System.out.println("Час: " + now.format(hourFormatter));

        // Минуты
        DateTimeFormatter minuteFormatter = DateTimeFormatter.ofPattern("mm");
        System.out.println("Минуты: " + now.format(minuteFormatter));

    }
}
