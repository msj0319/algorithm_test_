public class Main {

    public static long solution(long n) {
        long answer = 0;
        int x = 0;
        x = (int) Math.sqrt(n);

        if (Math.pow(x,2) == n) {
            answer = (long) Math.pow(x+1,2);
        }
        else {
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println((solution(3)));
    }
}