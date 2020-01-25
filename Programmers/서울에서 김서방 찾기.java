class Solution {
  public String solution(String[] seoul) {
      String answer = "";
      String kim = "Kim";
      int i = 0;
      for (i=0; i<seoul.length; i++){
          if (seoul[i].equals(kim)){
             answer = "김서방은 "+i+"에 있다";
          }
      }
      return answer;
  }
}