package _05_class._04_interitance;

class Vehicle {

  // 차량의 브랜드, 모델, 제조년도를 나타내는 속성
  private String brand;
  private String model;
  private int year;

  // 생성자
  public Vehicle(String brand, String model, int year) {
    this.brand = brand;
    this.model = model;
    this.year = year;
  }

  // 차량을 시작하는 동작
  public void start() {
    System.out.println("차량 시동을 걸었습니다.");
  }

  // 차량을 정지하는 동작
  public void stop() {
    System.out.println("차량을 정지했습니다.");
  }

  // Getter 메소드들
  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public int getYear() {
    return year;
  }

  // 객체 정보를 문자열로 반환하는 메소드
  @Override
  public String toString() {
    return ( "Vehicle{" + "brand='" + brand +'\'' + ", model='" +  model + '\'' + ", year=" + year + '}');
  }
}
