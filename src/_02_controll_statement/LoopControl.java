package _02_controll_statement;

import javax.script.ScriptContext;
import java.util.Scanner;

public class LoopControl {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++){
      System.out.println(i);
    }

//    while 문
//    do-while문
//    적어도 한번은 수행되는 반복문
    int j = 1;
    do {
      System.out.println(j);
      j++;
    } while (j <=10);

    String[] array = {"A", "B", "C"};
    for (String a: array){
      System.out.println("a = " + a);

    }

    Scanner scanner = new Scanner(System.in);
    System.out.println("숫자를 입력해주세요");
  int number = scanner.nextInt();

          for (int i = 1; i <=number; i++){
            System.out.printf(i + " ");
          }

  }
}
