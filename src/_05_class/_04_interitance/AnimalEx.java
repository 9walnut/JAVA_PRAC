package _05_class._04_interitance;

public class AnimalEx {
  public static void main(String[] args) {
    Cat cat1 = new Cat("고양이", "미호", 20);
    Dog dog1 = new Dog("강아지", "호두", 20);
  cat1.makeSound();
  dog1.makeSound();
  }
}
