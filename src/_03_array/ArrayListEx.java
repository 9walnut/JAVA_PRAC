package _03_array;

// Collection Framework
// : 객체를 효율적으로 추가, 삭제, 검색할 수 있도록 관련 인터페이스 & 클래스를 java.util 에 포함 시켜 놓음

// List
// ㄴ ArrayList

// Set
// ㄴ HashSet
// ㄴ TreeSet

// Map
// ㄴ HashMap
// ㄴ Hashtable
// ㄴ TreeMap

import java.util.ArrayList;
import java.util.Arrays;

// ArrayList 클래스
// - List 컬렉션에서 가장 많이 사용하는 컬렉션
// - 표준 배열보다 조금 느릴 수 있으나, 배열에서 많은 조작이 필요한 경우에 유용
// - 크기를 미리 지정하지 않아도 됨 (동적 할당, 일반 배열과 차이점)
// - List 컬렉션은 객체 자체를 저장하는게 아니라, 객체 번지를 저장 => 동일한 객체를 중복 저장할 수도 있는데,
// 동일한 번지수가 저장되었다, null 도 가능
public class ArrayListEx {
  public static void main(String[] args) {
    // 1. ArrayList 생성 (정수형)
    ArrayList<Integer> numbers = new ArrayList<>();

    // 2. 요소 추가
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(50);

    // 3. 요소 접근
    System.out.println("첫번 째 요소: " + numbers.get(0)); // 10

    // 4. 요소 수정
    numbers.set(1, 77);
    System.out.println("numbers : " + numbers); // [10, 77, 30, 40, 50]

    // 5. 요소 삽입 (지정된 위치)
    numbers.add(1, 7);
    System.out.println("numbers : " + numbers); // [10, 7, 77, 30, 40, 50]

    // 6. ArrayList 끼리 연결
    System.out.println(Arrays.asList(99, 33, 55)); // [99, 33, 55]
    numbers.addAll(Arrays.asList(99, 33, 55));
    System.out.println("numbers : " + numbers); // [10, 7, 77, 30, 40, 50, 99, 33, 55]

    // 7. 요소 위치 찾기
    System.out.println(numbers.indexOf(10));
    System.out.println(numbers.indexOf(30));
    System.out.println(numbers.indexOf(99));

    // 8. 요소 삭제
    numbers.remove(2);
    System.out.println("numbers : " + numbers); // [10, 7, 30, 40, 50, 99, 33, 55]

    // 9. 리스트 크기 확인
    System.out.println("리스트 크기 : " + numbers.size()); // 8

    // 10. 모든 요소 출력
    for (Integer n : numbers) {
      System.out.print(n + " ");
    } // 10 7 30 40 50 99 33 55

    // 11. 모든 요소 삭제
    numbers.clear();
    System.out.println("numbers : " + numbers); // []

    ///////////////////////////////////////////////

    // Student 타입의 ArrayList 생성
    ArrayList<Student> students = new ArrayList<>();

    students.add(new Student("John", 10));

    Student std1 = new Student("Jennie", 14);
    students.add(std1);

  }
}


class Student {
  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {return name;}
  public int getAge() {return age;}
}