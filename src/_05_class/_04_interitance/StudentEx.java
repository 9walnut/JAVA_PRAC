package _05_class._04_interitance;

public class StudentEx {
  public static void main(String[] args) {
    Student std1 = new Student("김새싹", 20);

////    부모, 자식 클래스의 필드가 퍼블릭인 경우
////    부모 클래스로부터 상속받은 필드 값 읽기
//    System.out.println(std1.name);
//    System.out.println(std1.age);
//    System.out.println(std1.campus);
////    Person 으로부터 상속받은 메소드 호출
//    std1.say();
//    std1.eat("바나나");
//    std1.setCampus("새싹용산");




    /////////////////////////////////////
//    Case 2. 부모, 자식 클래스의 필드가 private인 경우
//    Person으로부터 상속 받은 필드 읽기
    System.out.println(std1.getName());
    System.out.println(std1.getAge());
//    Student 필드 읽기
    System.out.println(std1.getCampus());
//    Person 으로부터 상속 받은 메서드 호출
    std1.say(); // public 메서드 
//    Student 메서드 호출
    std1.setCampus("새싹 용산");
    System.out.println(std1.getCampus());
  }
}
