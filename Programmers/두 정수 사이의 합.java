class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if (a < b) {
            while (b >= a) {
                answer += b;
                b--;
            }
        }
        else if (b < a) {
            while (a >= b) {
                answer += a;
                a--;
            }
        }
        else if (a==b) {
            answer = a;
        }
        
        return answer;
    }
}