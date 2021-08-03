class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;

        for (long i=1; i<=count; i++) {
            sum += (long)price * i;
        }
        
        if (money - sum >= 0) {
            answer = 0;
        }
        else {
            answer = sum - money;
        }
        
        return answer;
    }
}