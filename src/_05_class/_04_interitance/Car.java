package _05_class._04_interitance;

class Car extends Vehicle {

  // Car에만 해당하는 추가 속성
  private final boolean convertible;

  // 생성자
  public Car(String brand, String model, int year, boolean convertible) {
    // 부모 클래스의 생성자 호출하여 초기화
    super(brand, model, year);
    this.convertible = convertible;
  }

  // 주차하는 동작
  public void park() {
    System.out.println("주차했습니다.");
  }

  // 객체 정보를 문자열로 반환하는 메소드를 오버라이드
  @Override
  public String toString() {
    return (
            "Car {" + "brand='" +  getBrand() +  '\'' +  ", model='" +getModel() + '\'' +", year=" +getYear() +", convertible=" +convertible +'}');
  }
}
