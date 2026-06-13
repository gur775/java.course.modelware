public class Practice1 {
    public static void main(String[] args) {

        System.out.println("StringBuilder - не потокобезопасный, но быстрее");
        System.out.println("StringBuffer - потокобезопасный, но медленнее");
        System.out.println("Методы у них одинаковые\n");

        // Создаём StringBuilder (можно заменить на StringBuffer)
        StringBuilder sb = new StringBuilder("Java");

        //append() - добавляет строку в конец
        sb.append(" Programming");
        System.out.println("append(): " + sb); // "Java Programming"

        // insert() - вставляет строку в указанную позицию
        sb.insert(5, "Awesome ");
        System.out.println("insert(5, 'Awesome '): " + sb); // "Java Awesome Programming"

        // replace() - заменяет часть строки
        sb.replace(5, 12, "Great");
        System.out.println("replace(5, 12, 'Great'): " + sb); // "Java Great Programming"

        // delete() - удаляет символы в диапазоне
        sb.delete(5, 10);
        System.out.println("delete(5, 10): " + sb); // "Java Programming"

        // reverse() - переворачивает строку
        sb.reverse();
        System.out.println("reverse(): " + sb); // "gnimmargorP avaJ"
        sb.reverse(); // возвращаем обратно

        // length() - возвращает длину
        System.out.println("length(): " + sb.length()); // 16

        // charAt() - возвращает символ по индексу
        System.out.println("charAt(2): " + sb.charAt(2)); // 'v'

        // setCharAt() - заменяет символ по индексу
        sb.setCharAt(2, 'V');
        System.out.println("setCharAt(2, 'V'): " + sb); // "JaVa Programming"

        // indexOf() - поиск подстроки
        int index = sb.indexOf("gram");
        System.out.println("indexOf('gram'): " + index); // 8


        // deleteCharAt() - удаляет символ по индексу
        sb.deleteCharAt(4);
        System.out.println("deleteCharAt(4): " + sb); // "JaVaProgramming" (удалили пробел)

    }
}
