public class Main {
    public static boolean solution(int x) {
        String str = "" + x;
        int num = str.length();
        int sum = 0;
        int temp = x;
        for (int i=0; i<num; i++) {
            sum += temp%10;
            temp/=10;
        }
        if (x % sum != 0)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        int x = 11;
        System.out.println(solution(x));
    }
}
