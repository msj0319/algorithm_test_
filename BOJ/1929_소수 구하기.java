import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] prime;

    //에라토스테네스의 체
    //k = 2부터 root N이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외시킨다.
    public static void getPrimeNumber() {
        //true면 소수, false면 소수 아님
        prime[0] = prime[1] = true;
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            //이미 배열값이 true면 다음 반복으로
            if (prime[i])
                continue;
            //i의 배수들을 걸러주기 위한 반복
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        prime = new boolean[N + 1];
        getPrimeNumber();

        StringBuilder sb = new StringBuilder();
        for (int i = M; i <= N; i++) {
            if (!prime[i])
                sb.append(i).append('\n');
        }
        System.out.println(sb);
    }

}

