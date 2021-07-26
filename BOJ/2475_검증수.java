import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] unique_num = new int[5];
        int verify_num = 0;

        for (int i=0; i<5; i++) {
            unique_num[i] = Integer.parseInt(st.nextToken());
            verify_num += Math.pow(unique_num[i], 2);
        }
        System.out.println(verify_num % 10);
    }
}