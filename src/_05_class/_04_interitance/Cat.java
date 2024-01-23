package _05_class._04_interitance;

public class Cat extends Animal {
  public Cat(String animalType, String name, int age){
    this.animalType = animalType;
    this.name = name;
    this.age = age;
  }

  @Override
  public void makeSound(){
    System.out.println("야옹");
  }
}
