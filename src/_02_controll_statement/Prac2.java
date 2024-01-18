package _02_controll_statement;

import java.util.Scanner;

public class Prac2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("나이를 입력하세요");
    int age = scanner.nextInt();
    if (age <= 7) {
      System.out.println("유아");
    } else if (age <= 13) {
      System.out.println("초등학생");
    } else if (age <= 16) {
      System.out.println("초등학생");
    }else if (age <= 19) {
      System.out.println("초등학생");
    } else {
      System.out.println("성인");
    }

    System.out.println("이름을 입력하세요");
    String name = scanner.next();
    if (name.equals("홍길동")){
      System.out.println("남자");
    } else if (name.equals("성춘향")){
      System.out.println("여자");
    } else {
      System.out.println("모르겠어요");
    }
  }
}