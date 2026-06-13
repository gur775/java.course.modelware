import java.util.StringJoiner;

public class JoinerDemo {
  public static void main(String[] args) {
    // Базовое использование с разделителем
    System.out.println("Список фруктов");
    StringJoiner fruits = new StringJoiner(", ");
    fruits.add("Яблоко");
    fruits.add("Банан");
    fruits.add("Апельсин");
    System.out.println(fruits);

    // С префиксом и суффиксом
    System.out.println("\nОформленный список");
    StringJoiner numberedList = new StringJoiner("\n", "Список задач:\n", "\nКонец списка");
    numberedList.add("1 задача");
    numberedList.add("2 задача");
    numberedList.add("3 задача");
    System.out.println(numberedList);

    // Объединение двух StringJoiner
    System.out.println("\nОбъединение списков");
    StringJoiner fruits1 = new StringJoiner(", ");
    fruits1.add("Яблоко").add("Груша");

    StringJoiner fruits2 = new StringJoiner(", ");
    fruits2.add("Апельсин").add("Банан");

    fruits1.merge(fruits2);
    System.out.println("Объединённый список: " + fruits1);

    // Работа с пустыми значениями
    System.out.println("\nОбработка пустых строк");
    StringJoiner emptyJoiner = new StringJoiner(", ");
    System.out.println("Пустой joiner: " + emptyJoiner);
    System.out.println("Длина: " + emptyJoiner.length());

  }
}
