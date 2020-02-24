class Solution {
  public String solution(String s, int n) {
      String answer = "";
      n = n % 26;
      for (int i=0; i<s.length(); i++){
          char ch = s.charAt(i);
          if (Character.isLowerCase(ch)) { //소문자면
              ch = (char)((ch-'a'+n) % 26 + 'a');
          }
          else if (Character.isUpperCase(ch)) { //대문자면
              ch = (char)((ch-'A'+n) % 26 + 'A');
          }
          else if (ch == 32) { //받은 문자가 공백일 때
            answer += "";
          }
          answer = answer + ch;
      }
      return answer;
  }
}