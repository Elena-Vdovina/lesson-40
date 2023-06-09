package people;

// Создайте классы "Мужчина" и "Женщина", которые будут наследниками класса "Человек".
// Попытка вывести их на экран должна приводить к выводу строки "Мужчина по имени ..."
// или "Женщина по имени ..."
// Метод "приветствие" класса "Женщина" должен выводить строку: "Я родилась!"
public class Woman extends Human {

  public Woman(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return String.format("Женщина по имени %s", getName());
  }

  @Override
  public void hallo() {
    System.out.println("Я родилась!");
  }
}
