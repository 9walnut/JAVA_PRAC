package _05_class._10_test;

public class test01 {

  public static int sumLessThan(int[] arr, int target){
    int sum = 0;

    for (int num : arr){
      if (num < target){
        sum += num;
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] nums1 = {2, 5, 8, 3, 7};
    int result = sumLessThan(nums1, 5);
    System.out.println(result);

  }
}
