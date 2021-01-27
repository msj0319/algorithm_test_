import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] sum = new int[n][m];

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                sum[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                sum[i][j] += sc.nextInt();
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
