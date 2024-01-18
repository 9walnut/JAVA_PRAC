package _03_array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPrac {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<String> arraylist = new ArrayList<>();
    while (true){
      System.out.println("문자를 입력해주세요.");
      String str = sc.next();

      if (str.equals("exit")){
        break;
      } else {
        arraylist.add(str);
      }
    }
      System.out.println(arraylist);
  }
}
