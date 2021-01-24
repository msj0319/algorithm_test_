class Solution {
    public String solution(String s) {
        String answer = "";
        char c = ' ';
        
        if (s.length() % 2 == 1) {
            c = s.charAt(s.length()/2);
            answer = Character.toString(c);
        } else {
            c = s.charAt((s.length()-1)/2);
            answer = Character.toString(c);
            c = s.charAt((s.length()-1)/2+1);
            answer += Character.toString(c);
            
        }
        return answer;
    }
}