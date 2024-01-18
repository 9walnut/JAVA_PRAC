package _01_basic_syntax;

import java.util.Scanner;

public class Prac {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("이름을 입력하세요");
    String name = scanner.next();
    System.out.println("나이를 입력하세요");
    int age = scanner.nextInt();
//    System.out.println("안녕하세요!" + name + "님" + "("+ age + "세)" );
    System.out.printf("안녕하세요 ! %s 님, %d 세 이시네요!", name, age);
  }
}
