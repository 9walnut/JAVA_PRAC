package _02_controll_statement;

public class Prac4 {

  public void area(int r){
    System.out.printf("반지름의 %d 넓이 : %f", r, Math.PI * r + r).println();
  }
  public void area(int a, int b){
    System.out.printf("가로 %d, 세로 %d인 직사각형 넓이 : %d",a, b, a * b).println();
  }
  public void area(int w, int h, boolean isTriangle){
    System.out.printf("밑변 %d, 높이 %d인 삼각형의 넓이 : %.1f", w, h, w*h*0.5).println();
  }

  public static void main(String[] args) {
    Prac4 ol = new Prac4();

    ol.area(5);
    ol.area(4, 5);
    ol.area(6, 3, true);
  }
}
