class Solution {
  public double solution(int[] arr) {
      double answer = 0;
      int count=0;
      double sum=0;
      
      for (int i=0; i<arr.length; i++) {
          sum += arr[i];
          count++;
      }
      answer = sum / count;
      
      return answer;
  }
}