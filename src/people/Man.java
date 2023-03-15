package people;

// Создайте классы "Мужчина" и "Женщина", которые будут наследниками класса "Человек".
// Попытка вывести их на экран должна приводить к выводу строки "Мужчина по имени ..."
public class Man extends Human {

  public Man(String name){
    super(name);
  }

  @Override
  public String toString() {
    return String.format("Мужчина по имени %s", getName());
  }
}
