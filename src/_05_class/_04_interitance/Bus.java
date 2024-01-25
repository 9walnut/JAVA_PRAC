package _05_class._04_interitance;

class Bus extends Vehicle {

  private final int passengerCapacity;

  // 생성자
  public Bus(String brand, String model, int year, int passengerCapacity) {
    // 부모 클래스의 생성자 호출하여 초기화
    super(brand, model, year);
    this.passengerCapacity = passengerCapacity;
  }

  // 승객을 운송하는 동작
  public void carryPassengers() {
    System.out.println("승객을 운송합니다.");
  }

  // 객체 정보를 문자열로 반환하는 메소드를 오버라이드
  @Override
  public String toString() {
    return (
            "Bus {" +
                    "brand='" +
                    getBrand() +
                    '\'' +
                    ", model='" +
                    getModel() +
                    '\'' +
                    ", year=" +
                    getYear() +
                    ", passengerCapacity=" +
                    passengerCapacity +
                    '}'
    );
  }
}