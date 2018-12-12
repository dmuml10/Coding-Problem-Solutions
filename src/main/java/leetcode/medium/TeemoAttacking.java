package leetcode.medium;

public class TeemoAttacking {

  public int findPoisonedDuration(int[] timeSeries, int duration) {
    int sum = 0;
    for (int i=0; i<timeSeries.length - 1; i++) {
      int increment = duration;
      if (timeSeries[i] + duration > timeSeries[i+1]) {
        increment = timeSeries[i+1] - timeSeries[i];
      }
      sum += increment;
    }
    if (timeSeries.length != 0)
      sum += duration;
    return sum;
  }

  public static void main(String[] args) {
    TeemoAttacking a= new TeemoAttacking();
    int[] array = {1,2};
    System.out.println(a.findPoisonedDuration(array, 2));
  }

}
