import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int temp = N;
        int cycle = 0;

        while (true) {
                //십의 자릿수     //일의 자릿수
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10); //60 + ((2 + 6) % 10) = 68
            cycle++;

            if (temp == N){
                break;
            }
        }
        System.out.println(cycle);
    }
}