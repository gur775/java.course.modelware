import java.util.Objects;

public class UserID {
  private int id;
  private String name;

  public UserID(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    // 1. Проверка на идентичность ссылок (оптимизация)
    if (this == o) return true;

    // 2. Проверка на null и принадлежность к одному классу
    if (o == null || getClass() != o.getClass()) return false;

    // 3. Приведение типа
    UserID user = (UserID) o;

    // 4. Сравнение полей
    return id == user.id && Objects.equals(name, user.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }
}
