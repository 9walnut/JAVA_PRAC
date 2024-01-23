package _05_class._02_static;

public class Student2 {
  private String name;
  private String studentID;
  private int grade;

  private static  int totalStudents = 0;

  public Student2(String name, String studentID, int grade){
    this.name = name;
    this.studentID = studentID;
    this.grade = grade;
    totalStudents++;
  }

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
  public void displayInfo(){
    System.out.println("===학생 정보===");
    System.out.println("이름 : " + name);
    System.out.println("학번 : " + studentID);
    System.out.println("학년 : " + grade);
  }
  
  public static int getTotalStudents(){
    return totalStudents;
  }

  public static void main(String[] args) {
    Student std1 = new Student("김새싹", "20231001", 1);
    Student std2 = new Student("김새싹", "20231001", 2);
    Student std3 = new Student("김새싹", "20231001", 3);

    std1.displayInfo();
    std2.displayInfo();
    std3.displayInfo();

    System.out.println("학생수는" + Student.getTotalStudents()+"명입니다");
  }
}
