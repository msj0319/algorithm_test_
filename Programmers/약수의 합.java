class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i<=3000; i++) {
            if(n%i ==0) {
            answer += n/i;
            }
        }

        return answer;
    }
}