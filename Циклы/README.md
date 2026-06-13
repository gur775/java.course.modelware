# Практика #1

## Приведите тривиальные примеры бесконечных циклов для конструкций while и do-while. 
### while (с условием true)
```java
while (true) {
    System.out.println("Этот цикл никогда не остановится");
}
```
### while (с условием 1 == 1)
```java
while (1 == 1) {
    System.out.println("Вечный цикл");
}
```
### do-while (с условием true)
```java
do {
    System.out.println("Выполнится хотя бы раз и повторится вечно");
} while (true);
```
### do-while (с условием, которое всегда истинно)
```java
boolean alwaysTrue = true;
do {
    System.out.println("Бесконечный do-while");
} while (alwaysTrue);
```
# Практика #2

## Приведите пример использования операторов break и continue с любым видом цикла. 
### break - прерывание цикла
```java
// Поиск числа 5 в массиве
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        System.out.println("Нашли число 5, выходим из цикла");
        break; // прерывает цикл полностью
    }
    System.out.println("Текущее число: " + i);
}
```
### continue - пропуск итерации
```java
// Вывод только нечётных чисел
for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) {
        continue; // пропускаем чётные числа
    }
    System.out.println("Нечётное число: " + i);
}
// Вывод: 1,3,5,7,9
```       
### break в while
```java
int count = 0;
while (true) {
    count++;
    if (count == 5) {
        break; // выход из бесконечного цикла
    }
}
```
### continue в while
```java
int i = 0;
while (i < 10) {
    i++;
    if (i == 5) {
        continue; // пропускаем вывод пятёрки
    }
    System.out.println(i);
}
// Вывод: 1,2,3,4,6,7,8,9,10
```