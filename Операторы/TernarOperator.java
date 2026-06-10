public class TernarOperator {
    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Status: " + status);  // Adult

        int a = 10, c = 50;
        int max = (a > c) ? a : c;
        System.out.println("Max: " + max);  // 50

        // Вложенный тернарный оператор
        int score = 85;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : "C";
        System.out.println("Grade: " + grade);  // B
    }
}
