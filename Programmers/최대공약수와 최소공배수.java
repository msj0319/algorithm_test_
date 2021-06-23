//유클리드 호제법을 사용한 최대공약수 구하기
// 1. mod 연산 사용(두 값을 나눈 나머지를 구하는 연산)
// 2. 나눴던 수(m)와 나머지(temp)로 다시 mod연산을 한다.
// 3. 나머지가 0이 되면 나누는 수로 사용된 m이 최대공약수가 된다.   

class Solution {
     public static int gcd(int n, int m) {
        while(true) {
            int temp = n%m;
            if (temp == 0)
                return m;
            n = m;
            m = temp;
        }
    }
    //최소공배수 = 두 자연수의 곱 / 최대 공약수
    public static int lcm(int n, int m) {
        return n * m / gcd(n,m);
    }
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] += gcd(n,m);
        answer[1] += lcm(n,m);
        return answer;
    }
}