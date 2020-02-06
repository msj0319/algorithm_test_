class Solution {
  public boolean solution(String s) {
      boolean answer = true;
      if (s.length() == 4 || s.length() == 6) {
          for (int i=0; i<s.length(); i++){
          
          if((65<= s.charAt(i) && s.charAt(i) <= 90) || (97<= s.charAt(i) && s.charAt(i) <= 122)){
              answer = false;
              break;
          }
         }
          return answer;
      }
      else answer=false;
      return answer;
  }
}