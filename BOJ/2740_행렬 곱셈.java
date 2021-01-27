import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,k;

        n = sc.nextInt();
        m = sc.nextInt();
        int [][] mat1 = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        m = sc.nextInt();
        k = sc.nextInt();
        int [][] mat2 = new int[m][k];
        for (int i=0; i<m; i++) {
            for (int j=0; j<k; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        int [][] mul = new int[n][k];

        for (int i=0; i<n; i++) {
            for (int j=0; j<k; j++) {
                int sum = 0;
                for (int l=0; l<m; l++) {
                    sum += mat1[i][l] * mat2[l][j];
                }
                mul[i][j] = sum;
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<k; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }
}