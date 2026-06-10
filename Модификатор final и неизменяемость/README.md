# Практика 1
## Как можно проинициализировать константу, которая объявлена следующим образом? 
Приведите все возможные варианты.
```java
public class A {
    public final int a;
}
```
## Инициализация при объявлении
```java
public class A {
    public final int a = 1;
}
```


## В конструкторе
```java
public class A {
    public final int a;
    public A() {
        a = 1;
    }
}
```
Можно сделать с параметрами:
```java
java
public class A {
    public final int a;
    public A(int value) {
        a = value;
    }
}
```


## Инициализация в блоке инициализации (instance initializer)
```java
public class A {
    public final int a;
    {
        a = 10;
    }
}
```
