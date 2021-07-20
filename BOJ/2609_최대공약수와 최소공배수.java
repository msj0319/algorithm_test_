import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int gcd(int a, int b) {
        while(true) {
            int temp = a % b;
            if (temp == 0)
                return b;
            a = b;
            b = temp;
        }
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a,b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write(gcd(a,b) + "\n");
        bw.write(lcm(a,b) + "\n");

        bw.close();
    }
}

