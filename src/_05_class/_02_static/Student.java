package _05_class._02_static;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

  // 1. 필드 정의
  private String name;
  private String studentID;
  private int grade;

  // 4. 클래스 변수로 총 학생 수 추적
  private static int totalStudents = 0;

  // 2. 생성자 정의
  public Student(String name, String studentID, int grade) {
    // 5. 생성자를 통해 이름, 학번, 학년을 초기화하고, totalStudents를 증가시킴
    this.name = name;
    this.studentID = studentID;
    this.grade = grade;
    totalStudents++;
  }

  // 3. Getter와 Setter 메서드 정의
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStudentID() {
    return studentID;
  }

  public void setStudentID(String studentID) {
    this.studentID = studentID;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  // 6. displayInfo 메서드 정의
  public void displayInfo() {
    System.out.println("\n==== 학생 정보 ====");
    System.out.println("이름: " + name);
    System.out.println("학번: " + studentID);
    System.out.println("학년: " + grade);
  }

  // 4. 클래스 변수 totalStudents에 대한 Getter 메서드
  public static int getTotalStudents() {
    return totalStudents;
  }

  public static void main(String[] args) {
    // 2명의 학생 생성
    Student std1 = new Student("김새싹", "20231001", 1);
    Student std2 = new Student("박지은", "20231002", 2);
    Student std3 = new Student("이은지", "20231002", 3);

    // displayInfo 메서드를 사용하여 학생 정보 출력
    std1.displayInfo();
    std2.displayInfo();
    std3.displayInfo();

    // 총 학생 수 출력
    System.out.println(
            "\n총 학생 수는 " + Student.getTotalStudents() + "명 입니다."
    );
  }
}
