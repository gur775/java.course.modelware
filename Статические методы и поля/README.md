# Практика #1
## Приведите все варианты вызова метода printVars()
```java
public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}
```

## Вызов через имя класса
```java
A.printVars();
```

## Вызов без указания класса (из того же класса)
```java
public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
    
    public static void main(String[] args) {
        printVars();  // без указания класса
    }
}
```

## Вызов через объект класса
```java
A obj = new A();
obj.printVars();  
```
Работает, но выдает предупреждение.

## Вызов через переменную, ссылающуюся на null
```java
A obj = null;
obj.printVars();  // Не выбросит ошибку
```
Статические методы принадлежат классу, а не объекту. Компилятор заменяет obj.printVars() на A.printVars() на этапе компиляции.