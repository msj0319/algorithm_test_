import java.util.Scanner;

public class Main {
    static int max(int a[]) {
        int max = a[0];
        for (int i=0; i<a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[9];
        int max = 0;
        int order = 0;

        for (int i=0; i<9; i++) {
            num[i] = sc.nextInt();
            if (max(num) == num[i])
                order = i + 1;
        }
        max = max(num);
        System.out.println(max + "\n" + order);
    }
}

