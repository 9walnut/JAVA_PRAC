package _02_controll_statement;

import java.util.Scanner;

public class Prac3 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    System.out.println("두개 입력");
    double num1 = sc.nextInt();
    double num2 = sc.nextInt();

    System.out.printf("덧셈 결과: %.1f", num1 + num2).println();
    System.out.printf("뺄셈 결과: %.1f", num1 - num2).println();
    System.out.printf("나눗셈 결과: %f", num1 / num2).println();
    System.out.printf("곱셈 결과: %.1f", num1 * num2).println();


  }
}
