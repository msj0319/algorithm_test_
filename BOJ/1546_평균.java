import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int [] num = new int[count];
        float max;
        float avg=0;

        for (int i=0; i<count; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        max = num[count-1];

        for (int j=0; j<count; j++) {
            avg += (num[j]/max)*100/count;
        }
        System.out.println(avg);
    }
}