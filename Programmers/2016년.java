class Solution {
    public String solution(int a, int b) {
        String[] yoyil = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] mdays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String answer = "";

        int days = b;

        for (int i=1; i<a; i++) {
            days += mdays[i-1];
        }

        days = days % 7 - 1;

        if (days == -1) {
            days = 6;
        }
        answer = yoyil[days];

        return answer;
    }
}