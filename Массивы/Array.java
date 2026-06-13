import java.util.Arrays;
public class Array {
    public static void main(String[] args) {

        System.out.println("Статистика\n");

        // Создаём массив оценок студентов
        int[] grades = {85, 92, 78, 88, 95, 67, 89, 76, 91, 84};

        // 1. toString() - вывод массива
        System.out.println("Список оценок: " + Arrays.toString(grades));

        // 2. sort() - сортируем для анализа
        Arrays.sort(grades);
        System.out.println("Отсортированные оценки: " + Arrays.toString(grades));

        // 3. binarySearch() - поиск оценки
        int searchGrade = 88;
        int position = Arrays.binarySearch(grades, searchGrade);
        System.out.println("Оценка " + searchGrade + " найдена на позиции: " + position);

        // 4. equals() - сравниваем с эталоном
        int[] standardGrades = {67, 76, 78, 84, 85, 88, 89, 91, 92, 95};
        boolean isMatch = Arrays.equals(grades, standardGrades);
        System.out.println("Массив совпадает с эталоном: " + isMatch);

        // 5. compare() - сравниваем с другим массивом
        int[] anotherClass = {70, 75, 80, 85, 90, 95, 100, 65, 72, 88};
        Arrays.sort(anotherClass);
        int comparison = Arrays.compare(grades, anotherClass);
        System.out.println("Сравнение с другим классом: " + comparison);
        if (comparison < 0) {
            System.out.println("Этот класс имеет более низкие оценки");
        } else if (comparison > 0) {
            System.out.println("Этот класс имеет более высокие оценки");
        } else {
            System.out.println("Оценки одинаковые");
        }

        System.out.println("Лучшая оценка: " + grades[grades.length - 1]);
        System.out.println("Худшая оценка: " + grades[0]);
    }
}
