package _05_class._09_collection._set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
  public static void main(String[] args) {
    // HashSet 컬렉션 생성
    Set<String> set1 = new HashSet<>();

    // 객체 저장
    set1.add("apple");
    set1.add("banana");
    set1.add("kiwi");
    // 중벅 저장은 안됨
//    set1.add("banana")
    System.out.println(set1);
    // 저장된 객체 개수 출력
    int size1 = set1.size();
    System.out.printf("총 %d 종류의 과일이 있습니다. %n%n", size1);

    ////////////////////////
    // Course 클래스 정의 후
    Set<Course> set2 = new HashSet<>();

    // 객체 저장
    Course java = new Course(101, "Java");
    Course js1 = new Course(102, "JavaScript");
    Course js2 = new Course(102, "JavaScript");
    System.out.println(java.hashCode());
    System.out.println(js1.hashCode());
    System.out.println(js2.hashCode());
    System.out.println(js1.equals(js2));

    set2.add(java);
    set2.add(js2);
    set2.add(js2);

    // 저장된 객체 개수 출력
    int size2 = set2.size();
    System.out.printf("총 %d 종류의 과정이 있습니다. %n%n", size2);

    // case 1. 반복문 사용
    System.out.println(" === 반복문으로 Set 객체 출력 ===");
    for (Course c : set2){
      System.out.println(c);
    }
    System.out.println();

    // case 2. iterator() 메서드로 반복자를 얻어 객체 하나씩 가져오기
    // iterator (반복자) 가 제공하는 메서드
    // - boolean hasNext() : 가져올 객체가 있음녀 true, 없으면 false
    // -E next() : 컬렉션에서 하나의 객체를 가져옴
    // -void remove() : next()로 가져온 객체를 set 컬렉션에서 제거
    System.out.println("====== iterator() 로 Set 객체 출력 =====");
    Iterator<Course>  iterator = set2.iterator();
    while (iterator.hasNext()){
      Course c = iterator.next();
      System.out.println(c);
    }
  }
}
