class Animal {
    public Animal getParent() {
        return new Animal();
    }
}

class Dog extends Animal {
    // ковариантный тип (Dog - подтип Animal) - работает
    @Override
    public Dog getParent() {  // можно вернуть подтип
        return new Dog();
    }

    // несовместимый тип - ошибка
    /*
    @Override
    public String getParent() {  // String не является подтипом Animal
        return "parent";
    }
    */
}
