package _05_class._04_interitance;

// 자바에서는 다중 상속이 지원이 안된다
// extends 뒤에는 하나의 부모만 올 수 있다.
// 부모 클래스 - 슈퍼 클래스 - person
// 자식 클래스 - 서브 클래스 - student
public class Person {
//  public String name;
//  public int age;
//
//  //  상속 step2 - super()
////  2-1 부모 클래스가 기본 생성자를 갖는 경우
////  public Person(){
////    System.out.println("부모 클래스 Person() 생성자가 실행되었습니다");
////  }
//
////  2-2 부모 클래스가 매개변수를 갖는 생성자를 갖는 경우
//  public Person(String name, int age){
//    this.name = name;
//    this.age = age;
//    System.out.println("부모 클래스 Person(name, age) 생성자 실행");
//  }
  public void say(){
    System.out.println("안녕");
  }
  public void eat(String food){
    System.out.println(food + "를(을) 먹고 있다.");
  }

  ///////////////////////////////////
  // Case 2. 필드가 private 인 경우
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
