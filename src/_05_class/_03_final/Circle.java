package _05_class._03_final;

import java.util.Scanner;

public class Circle {
//  반지름 생성자 통해 초기화, final 필드 선언
  private final double radius;
//  원주율 상수 선언
  public static final double PI = 3.141592;
  public Circle(double radius){
    this.radius = radius;
  }
  public double getRadius(){return radius;}
  public double calculateArea() {return radius * radius* PI;}

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("원의 반지름을 입력하세요");
    double radius = scanner.nextDouble();

//    생성자 통해 초기화
    Circle circle01 = new Circle(radius);
    System.out.println("원의 반지름" + circle01.getRadius());
    System.out.println("원의 넓이 : " + circle01.calculateArea());
  }

}
