// Создаём иерархию исключений Ex1 ← Ex2 ← Ex3
class Ex1 extends Exception {
    public Ex1(String msg) { super(msg); }
}

class Ex2 extends Ex1 {
    public Ex2(String msg) { super(msg); }
}

class Ex3 extends Ex2 {
    public Ex3(String msg) { super(msg); }
}

public class Practice1 {
    public static void main(String[] args) {

        try {
            int random = (int) (Math.random() * 5);

            // несколько исключений обрабатываются одинаково
            if (random == 0) {
                throw new NullPointerException("Null pointer error");
            } else if (random == 1) {
                throw new ArrayIndexOutOfBoundsException("Index out of bounds");
            } else if (random == 2) {
                throw new NumberFormatException("Invalid number format");
            }
            // исключения с иерархией Ex1 ← Ex2 ← Ex3
            else if (random == 3) {
                throw new Ex3("Исключение уровня 3");
            } else {
                throw new Ex2("Исключение уровня 2");
            }

        } catch (NullPointerException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
            // три исключения обрабатываются одинаково
            System.out.println("Обработка стандартных исключений");
            System.out.println("Тип: " + e.getClass().getSimpleName());
            System.out.println("Сообщение: " + e.getMessage());

        } catch (Ex3 e) {
            // самый конкретный (дочерний) - первым
            System.out.println("Иерархия Ex3");
            System.out.println("Поймано Ex3: " + e.getMessage());

        } catch (Ex2 e) {
            // более общий (родительский) - после дочернего
            System.out.println("Иерархия Ex2");
            System.out.println("Поймано Ex2: " + e.getMessage());

        } catch (Ex1 e) {
            // самый общий - последним
            System.out.println("Иерархия Ex1");
            System.out.println("Поймано Ex1: " + e.getMessage());
        }
    }
}
