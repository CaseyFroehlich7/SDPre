public class Objective3Lab1 {
  public static void main(String[] args) {
    int [] nums = {15, 6, 2};
      float sum = 0;
      int i=0;
      while(i < nums.length) {
        sum += nums[i];
        i++;
      }
float average = (sum / nums.length);
  System.out.println(average);

  }
}
