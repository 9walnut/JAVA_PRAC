package _05_class._09_collection._set;

public class Course {
  private int id;
  private String title;

  public Course(int id, String title){
    this.id = id;
    this.title = title;
  }

  // id, title 값이 같으면 동일한 hashCode 리턴함
  // 참고, hashCode 란?
  // - hashCode : 객체의 메모리 주소를 기반으로 한 정수 값의 해시 코드


  @Override
  public int hashCode(){
    return title.hashCode() + id;
  }

  @Override
  public boolean equals(Object obj){
    if (obj instanceof  Course target){
      // id 는 int 이므로 == 비교
      // title 은 String 이므로 equals 로 비교
      return target.id == id && target.title.equals(title);
    } else {
      return false;
    }
  }

  @Override
  public String toString(){
    return "Course{" + "id= '" + id + '\'' + ", title= '" + title + '\'' + "}";
  }
}
