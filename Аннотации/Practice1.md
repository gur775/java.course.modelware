# Практика #1

### Объясните, зачем нужны следующие аннотации и приведите примеры их использования.

    @Override
    @Deprecated
    @SuppressWarnings

## @Override
Указывает, что метод переопределяет метод суперкласса или реализует метод интерфейса. Помогает компилятору проверить, действительно ли метод переопределяется.
```java
class Parent {
   void show() { System.out.println("Parent"); }
}

class Child extends Parent {
    @Override
    void show() { System.out.println("Child"); } // проверяет, что метод действительно переопределён
}
```

## @Deprecated
Помечает элемент (класс, метод, поле) как устаревший. Компилятор выдаёт предупреждение при его использовании. Программисты получают сигнал, что этот элемент не рекомендуется использовать и будет удалён в будущих версиях.
```java
class OldClass { 
    @Deprecated
    void oldMethod() { System.out.println("Устарел"); }

    void newMethod() { System.out.println("Новый метод"); }
    }
```

## @SuppressWarnings
Подавляет предупреждения компилятора для помеченного элемента. Используется, когда предупреждение известно и его нельзя устранить, или код корректен, но компилятор ложно сигнализирует о проблеме.
```java
@SuppressWarnings("unchecked")
List<String> list = new ArrayList(); // подавляет предупреждение о raw type

@SuppressWarnings({"deprecation", "unchecked"}) // несколько предупреждений
void test() { }
```