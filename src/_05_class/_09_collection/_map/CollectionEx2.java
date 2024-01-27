package _05_class._09_collection._map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CollectionEx2 {
  public static void main(String[] args) {
    Map<String, Integer> nameAgeMap  = new HashMap<>();

    Scanner sc = new Scanner(System.in);
    System.out.println("이름과 나이를 입력하세요. 종료를 입력하면 종료됩니다.");

    while (true){
      System.out.println("이름 입력 : ");
      String string = sc.nextLine();
      if (string.equals("종료")){
        break;
      }
      System.out.println("나이 입력 : ");
      Integer integer = sc.nextInt();
      sc.nextLine(); // 버퍼 비우기


      nameAgeMap.put(string, integer);
    }
    System.out.println("\n== 입력 받은 이름과 나이 목록 ==");

    for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
      System.out.println(
              "이름: " + entry.getKey() + ", 나이: " + entry.getValue()
      );
    }

    // Scanner 리소스 해제
    sc.close();
  }
}
