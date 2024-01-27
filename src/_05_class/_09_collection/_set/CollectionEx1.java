package _05_class._09_collection._set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionEx1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Set<Integer> uniqueIntegers = new HashSet<>();
    System.out.println("정수를 입력하세요. -1을 입력하면 종료됩니다");

    while (true){
      System.out.println("정수 입력 :");
      int input = sc.nextInt();

      if (input == -1){
        break;
      }
      uniqueIntegers.add(input);
    }
    System.out.println("중복 제거된 정수 목록 : " + uniqueIntegers);
    sc.close();
  }
}
